package com.revature.project1.services;

import com.revature.project1.beans.Employee;
import com.revature.project1.util.ConnectionFactory;

public class AuthenticationService {
	private static EmployeeServices es = new EmployeeServices();
	public static ConnectionFactory cf = ConnectionFactory.getInstance();
	public AuthenticationService() {
		
	}
	
	public Employee authenticateEmployee(String username, String password) {
		Employee e = null;
		e = es.myInfo(username);
		if(username.equals(e.getUsername()) && password.equals(e.getPassword())){
			e = new Employee();
		} return e;
			
		

	}

}
