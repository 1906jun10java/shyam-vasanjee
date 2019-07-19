package com.revature.project1.DAO;

import java.sql.SQLException;

import com.revature.project1.beans.Employee;

public class SQLUtility {
	
	public static void insertEmployee(Employee e) {
		EmployeeDAO ed = new EmployeeDAO();
		try {
			ed.createEmployee(e);
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
	public static void getEmployees() {
		EmployeeDAO ed = new EmployeeDAO();
		try {
			ed.populateEmployeeList();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
