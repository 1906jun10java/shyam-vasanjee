package com.revature.project1.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.project1.beans.Reimbursements;
import com.revature.project1.util.ConnectionFactory;

public class ReimbursementsDAO {
	public static ConnectionFactory cf = ConnectionFactory.getInstance();
	
	public void createReimbursements(Reimbursements r) {
		Connection conn =  cf.getConnection();
		String sql = "{ call INSERT INTO REIMBURSEMENTS VALUES(?,?,?,?)";
		try {
			CallableStatement call = conn.prepareCall(sql);
			call.setInt(1, r.getReimbursementRequestID());
			call.setDouble(2, r.getReimbursementAmount());
			call.setString(3,  r.getReimbursementStatus());
			call.setInt(4, r.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Reimbursements> viewAllReimb() throws SQLException{
		List<Reimbursements> reimbursements = new ArrayList<Reimbursements>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM REIMBURSEMENTS");
		Reimbursements r =  null;
		while(rs.next()) {
			r = new Reimbursements();
			reimbursements.add(r);
		}
		return reimbursements;
	}
	
	public Reimbursements getStatus() throws SQLException{
		Reimbursements r =  null;
		Connection conn = cf.getConnection();
		String sql = "SELECT REIMBURSEMENT_STATUS FROM REIMBURSEMENTS";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int rid = rs.getInt("REIMBURSEMENTREQUESTID");
			double amount = rs.getDouble("REIMBURSEMENT_AMT");
			String status = rs.getString("REIMBURSEENT_STATUS");
			int eid = rs.getInt("ID");
			r = new Reimbursements(rid, amount, status, eid);
		}
		return r;
	}
	
	

}
