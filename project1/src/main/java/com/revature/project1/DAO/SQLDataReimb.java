package com.revature.project1.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.project1.beans.Reimbursements;

public class SQLDataReimb {
	private static ReimbursementsDAO rd = new ReimbursementsDAO();
	
	
	
	public static Reimbursements makeRequest(Reimbursements r) {
		try {
			rd.createReimbursements(r);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	public static List<Reimbursements> getAllReimbs(){
		List<Reimbursements> allReimbs = new ArrayList<>();
		try {
			allReimbs = rd.viewAllReimb();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allReimbs;
	}
	
	public static List<Reimbursements> getReimbStatus(String status){
		List<Reimbursements> Rstatus = new ArrayList<>();
		try {
			Rstatus = rd.getStatus(status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Rstatus;
	}
	
	public static Reimbursements updateStat(int id, String status) {
		Reimbursements r = new Reimbursements();
		try {
			r = rd.updateStatus(id, status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	public static List<Reimbursements> getReimID(int id, String status) {
		List<Reimbursements> temp = null;
		try {
			temp = rd.getReimbById(id, status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

}
