package com.revature.project1.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import com.revature.project1.beans.Employee;
import com.revature.project1.util.ConnectionFactory;

public class ManagerDAO {
	
public static ConnectionFactory cf = ConnectionFactory.getInstance();
	
	public void createEmployee(Employee m) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "{ call INSERTEMPLOYEE(?,?,?,?,?,?,?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setInt(1, m.getId());
		call.setString(2, m.getFirstName());
		call.setString(3, m.getLastName());
		call.setString(4,m.getPassword());
		call.setInt(5, m.getReportsTo());
		call.setString(6, m.getTitle());
		call.setInt(7, m.getReimbursementRequestID());
		
	}
	
	
	


}
