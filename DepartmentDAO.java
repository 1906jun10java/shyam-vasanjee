package revature.dao;

import java.sql.SQLException;

import revature.beans.Department;

public interface DepartmentDAO {
	
	public void createDepartment(Department d) throws SQLException;

}
