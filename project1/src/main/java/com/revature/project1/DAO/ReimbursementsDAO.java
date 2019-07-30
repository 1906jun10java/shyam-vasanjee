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
		+ " VALUES(?,?,?,?,?,?)";
		
			PreparedStatement call = conn.prepareCall(sql);
			call.setInt(1, r.getReimbursementRequestID());
			call.setDouble(2, r.getReimbursementAmount());
			call.setString(3,  r.getReimbursementStatus());
			call.setInt(4, r.getId());
			call.setString(5, r.getFirstName());
			call.setString(6, r.getLastName());
			call.execute();
		} 
	
	
	public List<Reimbursements> viewAllReimb() throws SQLException{
		List<Reimbursements> reimbursements = new ArrayList<Reimbursements>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM REIMBURSEMENTS");
		Reimbursements r =  null;
		while(rs.next()) {
			int RRID = rs.getInt("REIMBURSEMENTSREQUESTID");
			double amount = rs.getDouble("REIMBURSEMENT_AMT");
			 String status = rs.getString("REIMBURSEMENT_STATUS");
			int Eid = rs.getInt("ID");
			String FirstName = rs.getString("FIRSTNAME");
			String LastName = rs.getString("LASTNAME");
			r = new Reimbursements(RRID, amount, status, Eid, FirstName, LastName);
			
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
			int RRID = rs.getInt("REIMBURSEMENTSREQUESTID");
			double amount = rs.getDouble("REIMBURSEMENT_AMT");
			 status = rs.getString("REIMBURSEMENT_STATUS");
			int Eid = rs.getInt("ID");
			String FirstName = rs.getString("FIRSTNAME");
			String LastName = rs.getString("LASTNAME");
			r = new Reimbursements(RRID, amount, status, Eid, FirstName, LastName);
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
	public List<Reimbursements> getReimbById(int id, String status) throws SQLException {
		List<Reimbursements> list = new ArrayList<>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM REIMBURSEMENTS WHERE ID = ? AND REIMBURSEMENT_STATUS=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,  id);
		ps.setString(2, status);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int RRID = rs.getInt("REIMBURSEMENTSREQUESTID");
			double amount = rs.getDouble("REIMBURSEMENT_AMT");
			 status = rs.getString("REIMBURSEMENT_STATUS");
			int Eid = rs.getInt("ID");
			String FirstName = rs.getString("FIRSTNAME");
			String LastName = rs.getString("LASTNAME");
			Reimbursements r = new Reimbursements(RRID, amount, status, Eid, FirstName, LastName);
			list.add(r);
			System.out.println(list);
		}
		return list;
	}
	public Reimbursements getReimbyEmployeeID(int id) throws SQLException {
		Reimbursements r =  null;
		Connection conn =  cf.getConnection();
		String sql = "SELECT * FROM WHERE ID=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
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
