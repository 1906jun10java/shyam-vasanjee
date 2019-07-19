package com.revature.project1.beans;

public class Employee {
	private int id;
	private String username;
	private String FirstName;
	private String LastName;
	private String password;
	private int reportsTo;
	private String title;
	private int reimbursementRequestID;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String lastName, String username, String password, int reportsTo, String title,
			int reimbursementRequestID) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.username = username;
		this.password = password;
		this.reportsTo = reportsTo;
		this.title = title;
		this.reimbursementRequestID = reimbursementRequestID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReimbursementRequestID() {
		return reimbursementRequestID;
	}
	public void setReimbursementRequestID(int reimbursementRequestID) {
		this.reimbursementRequestID = reimbursementRequestID;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", password=" + password
				+ ", reportsTo=" + reportsTo + ", title=" + title + ", reimbursementRequestID=" + reimbursementRequestID
				+ "]";
	}
	
	

}
