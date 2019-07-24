package com.revature.project1.beans;

public class Reimbursements {
	
	private int reimbursementRequestID;
	private double reimbursementAmount;
	private String reimbursementStatus;
	private int id;
	private String FirstName;
	private String LastName;
	public Reimbursements() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reimbursements(int reimbursementRequestID, double reimbursementAmount, String reimbursementStatus, int id, String FirstName, String LastName) {
		super();
		this.reimbursementRequestID = reimbursementRequestID;
		this.reimbursementAmount = reimbursementAmount;
		this.reimbursementStatus = reimbursementStatus;
		this.id = id;
		this.FirstName=FirstName;
		this.LastName = LastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public int getReimbursementRequestID() {
		return reimbursementRequestID;
	}
	public void setReimbursementRequestID(int reimbursementRequestID) {
		this.reimbursementRequestID = reimbursementRequestID;
	}
	public double getReimbursementAmount() {
		return reimbursementAmount;
	}
	public void setReimbursementAmount(double reimbursementAmount) {
		this.reimbursementAmount = reimbursementAmount;
	}
	public String getReimbursementStatus() {
		return reimbursementStatus;
	}
	public void setReimbursementStatus(String reimbursementStatus) {
		this.reimbursementStatus = reimbursementStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Reimbursements [reimbursementRequestID=" + reimbursementRequestID + ", reimbursementAmount="
				+ reimbursementAmount + ", reimbursementStatus=" + reimbursementStatus + ", id=" + id + ", FirstName="
				+ FirstName + ", LastName=" + LastName + "]";
	}
	
	
	

}
