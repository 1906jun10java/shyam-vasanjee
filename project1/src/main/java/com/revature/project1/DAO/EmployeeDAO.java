package com.revature.project1.DAO;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.project1.beans.Employee;
import com.revature.project1.util.ConnectionFactory;

public class EmployeeDAO {

	public static ConnectionFactory cf = ConnectionFactory.getInstance();

	public void createEmployee(Employee e) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "{ call INSERTEMPLOYEE(?,?,?,?,?,?,?,?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setInt(1, e.getId());
		call.setString(2, e.getFirstName());
		call.setString(3, e.getLastName());
		call.setString(4, e.getUsername());
		call.setString(5, e.getPassword());
		call.setInt(6, e.getReportsTo());
		call.setString(7, e.getTitle());
		call.setInt(8, e.getReimbursementRequestID());
		call.execute();

	}

	public List<Employee> populateEmployeeList() throws SQLException {
		List<Employee> employeeRoster = new ArrayList<Employee>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");
		Employee e = null;
		while (rs.next()) {
			int Employeeid = rs.getInt("ID");
			String firstname = rs.getString("FIRST_NAME");
			String lastname = rs.getString("LAST_NAME");
			String Username = rs.getString("USERNAME");
			String Password = rs.getString("PASSWORD");
			int reportsTo = rs.getInt("REPORTSTO");
			String title = rs.getString("TITLE");
			int RRID = rs.getInt("REIMBURSEMENTREQUESTID");
			e = new Employee(Employeeid, firstname, lastname, Username, Password, reportsTo, title, RRID);
			employeeRoster.add(e);
		}
		return employeeRoster;
	}

	public Employee getEmployeeUser(String username) throws SQLException, IOException {
		
		Connection conn = cf.getConnection();
			String sql = "SELECT * FROM EMPLOYEES WHERE USERNAME = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			System.out.println("Result set: " + rs);
			Employee e = null;
			while (rs.next()) {
				int Employeeid = rs.getInt("ID");
				String firstname = rs.getString("FIRST_NAME");
				String lastname = rs.getString("LAST_NAME");
				String Username = rs.getString("USERNAME");
				String Password = rs.getString("PASSWORD");
				int reportsTo = rs.getInt("REPORTSTO");
				String title = rs.getString("TITLE");
				int RRID = rs.getInt("REIMBURSEMENTREQUESTID");
				e = new Employee(Employeeid, firstname, lastname, Username, Password, reportsTo, title, RRID);
			}
			return e;
		
		
	}

	public List<Employee> getUnderlings(int id) throws SQLException {
		List<Employee> henchmen = new ArrayList<Employee>();
		Employee e = null;
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM EMPLOYEES WHERE REPORTSTO = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int Employeeid = rs.getInt("ID");
			String firstname = rs.getString("FIRST_NAME");
			String lastname = rs.getString("LAST_NAME");
			String Username = rs.getString("USERNAME");
			String Password = rs.getString("PASSWORD");
			int reportsTo = rs.getInt("REPORTSTO");
			String title = rs.getString("TITLE");
			int RRID = rs.getInt("REIMBURSEMENTREQUESTID");
			e = new Employee(Employeeid, firstname, lastname, Username, Password, reportsTo, title, RRID);
			henchmen.add(e);
		}
		return henchmen;

	}

	public Employee getEmployeeByID(int id) throws SQLException{
		Employee e = new Employee();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM EMPLOYEES WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		System.out.println("Result set: " + rs);
		while (rs.next()) {
			int Employeeid = rs.getInt("ID");
			String firstname = rs.getString("FIRST_NAME");
			String lastname = rs.getString("LAST_NAME");
			String Username = rs.getString("USERNAME");
			String Password = rs.getString("PASSWORD");
			int reportsTo = rs.getInt("REPORTSTO");
			String title = rs.getString("TITLE");
			int RRID = rs.getInt("REIMBURSEMENTREQUESTID");
			e = new Employee(Employeeid, firstname, lastname, Username, Password, reportsTo, title, RRID);
		}
return e;
	}
	public void updateEmployee(Employee e) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "UPDATE EMPLOYEES SET ID=?,FIRST_NAME=?,LAST_NAME=?"
				+" USERNAME=? + PASSWORD=? + REPORTSTO=? TITLE=?"
				+" REIMBURSEMENTREQUESTID=?";
		PreparedStatement call = conn.prepareStatement(sql);
		call.setInt(1, e.getId());
		call.setString(2, e.getFirstName());
		call.setString(3, e.getLastName());
		call.setString(4, e.getPassword());
		call.setInt(5, e.getReportsTo());
		call.setString(6, e.getTitle());
		call.setInt(7, e.getReimbursementRequestID());
		call.executeQuery();
		
		
	}
}
