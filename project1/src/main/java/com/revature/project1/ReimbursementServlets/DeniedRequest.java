package com.revature.project1.ReimbursementServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.beans.Reimbursements;
import com.revature.project1.services.EmployeeServices;


@WebServlet("/DeniedRequest")
public class DeniedRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EmployeeServices es = new EmployeeServices();
    
    public DeniedRequest() {
        super();
        
    }

	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("DeniedRequest.html");
		// start session
		HttpSession session = request.getSession();
		int EmployeeId = Integer.valueOf(request.getParameter("Employee ID"));
		List<Reimbursements> deniedRequests = es.decline(EmployeeId);
		if (session != null) {
			if (!deniedRequests.isEmpty()) {
				deniedRequests = (List<Reimbursements>) session.getAttribute("Reimbursements");
				session.setAttribute("Reimbursements", deniedRequests);
				session.setAttribute("problem", null);
				response.sendRedirect("ManagerHomePage.html");
			} else {
				session.setAttribute("problem", "empty list");
				response.sendRedirect("ManagerHomePage.html");

			}
		} else {
			response.sendRedirect("ManagerHomePage.html");
		}


		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
