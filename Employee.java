package revature.beans;

public class Employee {
	private int Employee_ID;
	private String Employee_FirstName;
	private String Employee_LastName;
	private int Department_ID;
	private double salary;
	private String Emp_Email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employee_ID, String employee_FirstName, String employee_LastName, int department_ID,
			double salary, String emp_Email) {
		super();
		Employee_ID = employee_ID;
		Employee_FirstName = employee_FirstName;
		Employee_LastName = employee_LastName;
		Department_ID = department_ID;
		this.salary = salary;
		Emp_Email = emp_Email;
	}
	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}
	public String getEmployee_FirstName() {
		return Employee_FirstName;
	}
	public void setEmployee_FirstName(String employee_FirstName) {
		Employee_FirstName = employee_FirstName;
	}
	public String getEmployee_LastName() {
		return Employee_LastName;
	}
	public void setEmployee_LastName(String employee_LastName) {
		Employee_LastName = employee_LastName;
	}
	public int getDepartment_ID() {
		return Department_ID;
	}
	public void setDepartment_ID(int department_ID) {
		Department_ID = department_ID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmp_Email() {
		return Emp_Email;
	}
	public void setEmp_Email(String emp_Email) {
		Emp_Email = emp_Email;
	}
	@Override
	public String toString() {
		return "Employee [Employee_ID=" + Employee_ID + ", Employee_FirstName=" + Employee_FirstName
				+ ", Employee_LastName=" + Employee_LastName + ", Department_ID=" + Department_ID + ", salary=" + salary
				+ ", Emp_Email=" + Emp_Email + "]";
	}
	
	

}
