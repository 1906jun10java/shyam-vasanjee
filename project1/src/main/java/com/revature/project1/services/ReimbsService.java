package com.revature.project1.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.project1.DAO.ReimbursementsDAO;
import com.revature.project1.DAO.SQLDataReimb;
import com.revature.project1.beans.Reimbursements;

public class ReimbsService {
	
	private ReimbursementsDAO rd = new ReimbursementsDAO();
	
	// add request
	public Reimbursements addRequest(int RRID, double amount, String status, int EmpID, String FN, String LN) {
	Reimbursements r = SQLDataReimb.makeRequest(RRID, amount, status, EmpID, FN, LN);
	return r;
	}
	// reimbursement id generator
	public int IDgenerator() {
		int prime = 29;
		int result = 1;
		int rand = 0;
		for (int i = 0; i < 1000; i++) { 
            rand = (int)(Math.random() * 1) + i;
		}
		result = prime*result*rand;
	return  result;
	}
	// List of all reimbursements
	public List<Reimbursements> viewAllReimbs(){
		List<Reimbursements> list =  new ArrayList<>();
		list = SQLDataReimb.getAllReimbs();
		return list;
		
	}
	public  List<Reimbursements> pendingRequests(){
		List<Reimbursements> pendingList = new ArrayList<>();
	pendingList = SQLDataReimb.getReimbStatus("pending");
		return pendingList;
	}
	
	//List of approved and denied requests
	public  List<Reimbursements> approvedRequests(){
		List<Reimbursements> appList = new ArrayList<>();
		appList = SQLDataReimb.getReimbStatus("approved");
		return appList;
	}
	public List<Reimbursements> deniedRequests(){
		List<Reimbursements> denList = new ArrayList<>();
		denList = SQLDataReimb.getReimbStatus("Denied");
		return denList;
	}
	public  List<Reimbursements> getReimbsbyStatus(String s){
		List<Reimbursements> RStatus = SQLDataReimb.getReimbStatus(s);
		return RStatus;
	}
	public  Reimbursements updateReimbStatus(int id, String status){
		Reimbursements r = SQLDataReimb.updateStat(id, status);
		return r;
		
	}
	public List<Reimbursements> getReimByStatnID(int id, String status){
		List<Reimbursements> empStatusList = SQLDataReimb.getReimID(id, status);
		return empStatusList;
	}
	public Reimbursements getReimByEID(int id) {
		
		try {
			Reimbursements r = rd.getReimbyEmployeeID(id);
			return r;
		} catch (SQLException e) {
			
			
		}
		return null;
		
	}
	

}
