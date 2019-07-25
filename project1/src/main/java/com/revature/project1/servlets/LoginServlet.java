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
	AuthenticationService as = new AuthenticationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Employee e = es.myInfo(username);
		if (e == null) {

			request.setAttribute("message", "Authentication failed.");
			response.sendRedirect("LoginPage");
			return;

		}

		if (password == null || !e.getPassword().equals(password)) {

			request.setAttribute("message", "Authentication failed.");
			response.sendRedirect("LoginPage");
			return;
		}
		if (session != null) {
			if (e != null) {

				session.setAttribute("EmployeeId", e.getId());
				session.setAttribute(username, e.getUsername());
				session.setAttribute("reportsTo", e.getReportsTo());
				session.setAttribute("RRID", e.getReimbursementRequestID());
				session.setAttribute("firstname", e.getFirstName());
				session.setAttribute("lastname", e.getLastName());
				session.setAttribute(password, e.getPassword());
				String url = "EmployeeHome";
				response.sendRedirect(url);
			}
		}
	}

//		HttpSession session = request.getSession(false);
//		Employee e = null;
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//
//		System.out.println("Employee" + e);
//
//		if (e != null) {
//			session.setAttribute("EmployeeId", e.getId());
//			session.setAttribute(username, e.getUsername());
//			session.setAttribute("reportsTo", e.getReportsTo());
//			session.setAttribute("RRID", e.getReimbursementRequestID());
//			session.setAttribute("firstname", e.getFirstName());
//			session.setAttribute("lastname", e.getLastName());
//			session.setAttribute(password, e.getPassword());
//			String url = "EmployeeHome";
//			response.sendRedirect(url);
//
//		} else {
//
//			request.setAttribute("message", "Authentication failed.");
//			response.sendRedirect("LoginPage");
//			return;
//		}
//
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
}
