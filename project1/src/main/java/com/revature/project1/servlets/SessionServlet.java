package com.revature.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.project1.beans.Employee;
import com.revature.project1.services.Verification;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	
       
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public SessionServlet() {
        super();
       
    }
	

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.println("Hitting");
		if(session != null && session.getAttribute("id")!=null) {
			
				System.out.println("inside try catch block");
				int id = Integer.parseInt(session.getAttribute("id").toString());
				String firstname = session.getAttribute("firstname").toString();
				String lastname = session.getAttribute("lastname").toString();
				String username = session.getAttribute("username").toString();
				String password = session.getAttribute("password").toString();
				int reportsTo = Integer.parseInt(session.getAttribute("reportsTo").toString());
				String title = session.getAttribute("title").toString();
				int reimbursementRequestID = Integer.parseInt(session.getAttribute("reimbursementrequestId").toString());
				Employee emp = new Employee(1,username, firstname, lastname, password, reportsTo, title, reimbursementRequestID);
				response.getWriter().write((new ObjectMapper()).writeValueAsString(emp));
				System.out.println("Are you null?"+emp);
			
		}else {
			response.sendRedirect("LoginPage");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("in the doPost method");
	}

}
