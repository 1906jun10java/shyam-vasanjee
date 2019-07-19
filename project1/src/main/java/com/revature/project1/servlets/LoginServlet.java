package com.revature.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.beans.Credentials;
import com.revature.project1.beans.Employee;
import com.revature.project1.employeeservice.AuthenticationService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
    private AuthenticationService as = new AuthenticationService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("P1UserLoginMenu.html").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Credentials creds = new Credentials(request.getParameter("username"), request.getParameter("password"));
		Employee e = as.authenicateEmployee(creds);

		if(e!=null) {
			session.setAttribute("EmployeeId", e.getId());
			session.setAttribute("firstname", e.getFirstName());
			session.setAttribute("lastname", e.getLastName());
			session.setAttribute("username", e.getUsername());
			session.setAttribute("reportsTo", e.getReportsTo());
			session.setAttribute("title", e.getTitle());
			session.setAttribute("problem", null);
			response.sendError(403, "successful login");
			System.out.println("in block code"+e);
		}else {
			session.setAttribute("problem", "invalid credentials");
			response.sendError(403, "You Fired!");
		}
	}

}
