package com.revature.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.beans.Employee;
import com.revature.project1.services.AuthenticationService;
import com.revature.project1.services.EmployeeServices;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeServices es = new EmployeeServices();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Employee e = es.myInfo(username);

		System.out.println("Employee" + e);
		if (username != e.getUsername()) {
			if (password != e.getPassword()) {
				generateSession(e, session);
				response.sendRedirect("EmployeeHomepage");
			}
		} else {
			response.sendRedirect("LoginPage");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	private void generateSession(Employee e, HttpSession session) {
		session.setAttribute("id", e.getId());
		session.setAttribute("username", e.getUsername());
		session.setAttribute("reportsTo", e.getReportsTo());
		session.setAttribute("reimbursementrequestId", e.getReimbursementRequestID());
		session.setAttribute("firstname", e.getFirstName());
		session.setAttribute("lastname", e.getLastName());
		session.setAttribute("password", e.getPassword());
		session.setAttribute("title", e.getTitle());
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
	}
}
