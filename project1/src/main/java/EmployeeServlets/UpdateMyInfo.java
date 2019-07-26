package EmployeeServlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.DAO.SQLUtilityEmployees;
import com.revature.project1.beans.Employee;
import com.revature.project1.services.EmployeeServices;

@WebServlet("/UpdateMyInfo")
public class UpdateMyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeServices es;

	public UpdateMyInfo() {
		es = new EmployeeServices();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("UpdateInformation.html").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String newId = request.getParameter("id").toString();
		String lastname = request.getParameter("lastName").toString();
		String title = request.getParameter("title").toString();
		String username = request.getParameter("username").toString();
		String password = request.getAttribute("password").toString();
		String firstname = session.getAttribute("firstname").toString();
		String reportsToraw = session.getAttribute("reportsTo").toString();
		int id = Integer.parseInt(newId);
		int reportsTo = Integer.parseInt(reportsToraw);
		int reimbursementRequestID = Integer.parseInt(session.getAttribute("reimbursementrequestId").toString());
		Employee e = new Employee(id, username, firstname, lastname, password, reportsTo, title,
				reimbursementRequestID);
		SQLUtilityEmployees.updateEmployeeInformation(e);
	}

}
