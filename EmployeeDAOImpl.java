package revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import revature.beans.Employee;
import revature.util.ConnectionFactory;

public class EmployeeDAOImpl {

	public static ConnectionFactory cf = ConnectionFactory.getInstance();

	public void createSuperHero(Employee e) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "{ call INSERT INTO EMPLOYEES(?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setInt(1, e.getEmployee_ID());
		call.setString(2, e.getEmployee_FirstName());
		call.setString(3, e.getEmployee_LastName());
		call.setInt(4, e.getDepartment_ID());
		call.setDouble(5, e.getSalary());
		call.setString(6, e.getEmp_Email());
		call.execute();
	}

	public List<Employee> getEmpList() throws SQLException {
		// statement - compiled on SQL
		// generally not safe
		// bad sql injection
		// takes in a raw string and uses it query the table
		List<Employee> EmployeeList = new ArrayList<Employee>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");// calls the colume of the query
		Employee e = null;
		while (rs.next()) {
			e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5),
					rs.getString(6));// makes a superhero a list of objects
			EmployeeList.add(e);
		}

		return EmployeeList;

	}
}
