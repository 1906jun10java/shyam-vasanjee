package com.revature.project1.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

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

}
