package com.revature.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.beans.Employee;
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
		
		int EmployeeId = e.getId();
		session.setAttribute("EmployeeId", EmployeeId);
		String url = "EmployeeHome";
		response.sendRedirect(url);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
}
