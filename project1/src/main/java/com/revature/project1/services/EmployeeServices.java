package com.revature.project1.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.project1.DAO.EmployeeDAO;
import com.revature.project1.DAO.SQLUtilityEmployees;
import com.revature.project1.beans.Employee;
import com.revature.project1.beans.Reimbursements;

public class EmployeeServices {
	private static ReimbsService rs = new ReimbsService();

	// Employee views their own information
	public Employee myInfo(String username) {
		Employee e = SQLUtilityEmployees.getEmployeeByUsername(username);
		return e;
	}

	// Manager view a list of their employees under them
	public List<Employee> myHenchmen(int reportsTo) {
		List<Employee> henchmen = SQLUtilityEmployees.getHenchmen(reportsTo);
		for (Employee e : henchmen) {
			System.out.println("My henchmen: " + e);
		}
		return henchmen;
	}

	// Manager approves requests
	public List<Reimbursements> approve(int id) {
		List<Reimbursements> appList = rs.approvedRequests();
		Reimbursements r = rs.getReimbsID(id);
		if (r.getReimbursementStatus().equals("pending")) {
			r.setReimbursementStatus("approved");
			appList.add(r);
			System.out.println("Approved Reimbursement: " + r);
		}
		return appList;
	}
//Manager denies reimbursement
	public List<Reimbursements> decline(int id) {
		List<Reimbursements> denList = rs.deniedRequests();
		Reimbursements r = rs.getReimbsID(id);
		if (r.getReimbursementStatus().equals("pending")) {
			r.setReimbursementStatus("Denied");
			denList.add(r);
			System.out.println("Denied Reimbursement: " + r);
		}
		return denList;
	}
	public List<Employee> getAllEmps(){
		EmployeeDAO ed = new EmployeeDAO();
		List<Employee> emps = new ArrayList<>();
		try {
			emps = ed.populateEmployeeList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;
	}
	
// views all qpproved requests
	public List<Reimbursements> viewResolvedRequests() {
		List<Reimbursements> resolved = rs.approvedRequests();
		int i = 0;
		for (Reimbursements r : resolved) {
			System.out.println(i + ") Resolved Reimbursements: " + r);
		}
		return resolved;
	}
	// gets an employee by their ID
	public Employee getEmployeebyId(int id) {
		Employee e = SQLUtilityEmployees.getEmpByID(id);
		return e;
		
	}
	//view all employees under a manager requests
	public List<Reimbursements> viewMyEmployeesReqs(int id, List<Reimbursements> resolved){
		Employee e = getEmployeebyId(id);// gets manager
		System.out.println("Manager in charge of set staff members: "+e);
		List<Employee> henchmen = myHenchmen(e.getId());// print all peeps that report to current manager
		for(Employee h: henchmen) {
			//traverses through each henchmen
			Reimbursements r  = rs.getReimbsID(h.getId());//gets their reimbursements
			resolved.add(r);// adds all their reimbursemments
			resolved = rs.getReimbsbyStatus("approved");//shows only reimbursements that are approved
		}
		return resolved;
	}
	// view one employees request(might be changed)
	public Reimbursements viewMyEmployeeReqs(int id) {
		Employee e = getEmployeebyId(id);
		Reimbursements r = rs.getReimbsID(e.getId());
		return r;
	}
}
