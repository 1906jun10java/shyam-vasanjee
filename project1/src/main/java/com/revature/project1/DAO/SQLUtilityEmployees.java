package com.revature.project1.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.project1.beans.Employee;



public class SQLUtilityEmployees {
	
	private static EmployeeDAO ed =  new EmployeeDAO();

	public static void createEmployee(Employee e) {
		
		ed = new EmployeeDAO();
		try {
			ed.createEmployee(e);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
	public static void updateEmployeeInformation(Employee e) {
		ed = new EmployeeDAO();
		try {
			ed.updateEmployee(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static List<Employee> getEmployees() {
		ed = new EmployeeDAO();
		List<Employee> list= new ArrayList<>();
		try {
			list = ed.populateEmployeeList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static Employee getEmployeeByUsername(String username) {
		ed = new EmployeeDAO();
		Employee e = null;
		try {
			e = ed.getEmployeeUser(username);
		} catch (SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}
	public static List<Employee> getHenchmen(int id){
		ed = new EmployeeDAO();
		List<Employee> henchmen = new ArrayList<>();
		try {
			henchmen = ed.getUnderlings(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return henchmen;
	}
	public static Employee getEmpByID(int id) {
		Employee e = new Employee();
		try {
		e = ed.getEmployeeByID(id);
		}catch(SQLException s) {
		s.printStackTrace();
		}
		return e;
	}

}
