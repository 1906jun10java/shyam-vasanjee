package revature.dao;

import java.sql.SQLException;

import revature.beans.Employee;

public interface EmployeeDAO {
	
	public void createEmployee(Employee e) throws SQLException;

}
