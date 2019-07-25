package com.revature.project1.DAO;

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
	
	public void createReimbursements(Reimbursements r) throws SQLException{
		Connection conn =  cf.getConnection();
		String sql = "INSERT INTO REIMBURSEMENTS (REIMBURSEMENTSREQUESTID,REIMBURSEMENT_AMT,REIMBURSEMENT_STATUS,ID,FIRSTNAME,LASTNAME) "
		+ " VALUES(?,?,'pending',?,?,?)";
		try {
			PreparedStatement call = conn.prepareCall(sql);
			call.setInt(1, r.getReimbursementRequestID());
			call.setDouble(2, r.getReimbursementAmount());
			//call.setString(3,  r.getReimbursementStatus());
			call.setInt(3, r.getId());
			call.setString(4, r.getFirstName());
			call.setString(5, r.getLastName());
			call.execute();
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
	
	public List<Reimbursements> getStatus(String status) throws SQLException{
		List<Reimbursements> Rstatus = new ArrayList<Reimbursements>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM REIMBURSEMENTS WHERE REIMBURSEMENT_STATUS = ?" ;
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,status);
		ResultSet rs = ps.executeQuery();
		Reimbursements r =  null;
		while(rs.next()) {
			r = new Reimbursements();
			Rstatus.add(r);
		}
		return Rstatus;
	}
	public Reimbursements updateStatus(int id, String status) throws SQLException{
		Reimbursements r =  null;
		Connection conn =  cf.getConnection();
		String sql = "UPDATE REIMBURSEMENTS SET REIMBURSEMENTS_STATUS = ? WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, status);
		ps.setInt(2, id);
		ResultSet rs = ps.executeQuery();
		ResultsetRow(rs, r);
		return r;
		
	}// getbyID and delete
	public Reimbursements getReimbById(int id) throws SQLException {
		Reimbursements r =  null;
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM REIMBURSEMENTS WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,  id);
		ResultSet rs = ps.executeQuery();
		ResultsetRow(rs, r);
		return r;
	}
	
	public void ResultsetRow(ResultSet rs, Reimbursements r) throws SQLException {
		int RRID;
		double amount;
		String status;
		int Eid;
		String FirstName;
		String LastName;
		while(rs.next()) {
			RRID = rs.getInt("REIMBURSEMENTREQUESTID");
			amount = rs.getDouble("REIMBURSEMENT_AMT");
			status = rs.getString("REIMBURSEMNT_STATUS");
			Eid = rs.getInt("ID");
			FirstName = rs.getString("FIRSTNAME");
			LastName = rs.getString("LASTNAME");
			r =  new Reimbursements(RRID, amount, status, Eid, FirstName, LastName);
		}
	}

}
