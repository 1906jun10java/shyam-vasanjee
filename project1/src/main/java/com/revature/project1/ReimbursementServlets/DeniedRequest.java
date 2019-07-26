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

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("DeniedRequest.html");
		// start session
				
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int EmployeeId = Integer.parseInt(request.getParameter("id"));
		List<Reimbursements> deniedRequests = es.decline(EmployeeId);
		if (session != null) {
			if (!deniedRequests.isEmpty()) {
				deniedRequests = (List<Reimbursements>) session.getAttribute("Reimbursements");
				session.setAttribute("Reimbursements", deniedRequests);
				response.sendRedirect("ManagerHomePage.html");
			} else {
				
				response.sendRedirect("ManagerHomePage.html");

			}
		} else {
			response.sendRedirect("ManagerHomePage.html");
		}



	}

}
