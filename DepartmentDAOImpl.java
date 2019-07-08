package revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import revature.beans.Department;
import revature.dao.DepartmentDAO;
import revature.util.ConnectionFactory;

public class DepartmentDAOImpl implements DepartmentDAO{
	
	public static ConnectionFactory cf = ConnectionFactory.getInstance();
	
	public void createDepartment(Department d) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO DEPARTMENT VALUES(SEQUENCE_1.NEXTVAL,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, d.getDepartment_Name());
		ps.executeUpdate();
	}

}
