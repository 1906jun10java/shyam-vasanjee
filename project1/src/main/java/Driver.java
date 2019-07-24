import java.util.List;

import com.revature.project1.DAO.SQLUtilityEmployees;
import com.revature.project1.beans.Employee;
import com.revature.project1.services.EmployeeServices;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 EmployeeServices es = new EmployeeServices();
		es.myHenchmen(1);
		System.out.println(SQLUtilityEmployees.getEmployees());
		

	}

}
