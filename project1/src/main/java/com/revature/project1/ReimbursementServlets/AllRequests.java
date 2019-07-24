package com.revature.project1.ReimbursementServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.project1.beans.Reimbursements;
import com.revature.project1.services.EmployeeServices;

@WebServlet("/AllRequests")
public class AllRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// all requests made by one employee
	private EmployeeServices es = new EmployeeServices();
	private ObjectMapper om;

	public AllRequests() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// start session
		request.getRequestDispatcher("EmployeeProfile.html").forward(request, response);
		HttpSession session = request.getSession();
		int EmployeeId = Integer.parseInt(request.getParameter("Employee ID: "));
		Reimbursements r = es.viewMyEmployeeReqs(EmployeeId);
		response.getWriter().write(om.writeValueAsString(r));
		System.out.println(r);
		session.setAttribute("problem", "No reimbursements have been made");
		response.sendRedirect("EmployeeProfile.html");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
