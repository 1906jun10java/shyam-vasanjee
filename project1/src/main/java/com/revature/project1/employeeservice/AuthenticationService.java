package com.revature.project1.employeeservice;

import com.revature.project1.beans.Credentials;
import com.revature.project1.beans.Employee;
import com.revature.project1.util.ConnectionFactory;
import com.revature.project1.DAO.EmployeeDAO;

public class AuthenticationService {
	public static ConnectionFactory cf = ConnectionFactory.getInstance();
	public AuthenticationService() {
		
	}
	
	public Employee authenicateEmployee(Credentials cred) {
		EmployeeDAO ed = new EmployeeDAO();
		Employee e = ed.getEmployeeID(cred.getUsername(), cred.getPassword());
		System.out.println("Authneication occurred: "+e);
		return e;
	}

}
