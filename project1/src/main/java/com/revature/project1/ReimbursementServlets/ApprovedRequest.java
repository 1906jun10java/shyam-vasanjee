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

/**
 * Servlet implementation class ApprovedRequest
 */
@WebServlet("/ApprovedRequest")
public class ApprovedRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeServices es = new EmployeeServices();

	public ApprovedRequest() {
		super();

	}

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("ApprovedRequest.html");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int EmployeeId = Integer.parseInt(request.getParameter("id"));
		List<Reimbursements> approvedRequests = es.approve(EmployeeId);
		if (session != null) {
			if (!approvedRequests.isEmpty()) {
				approvedRequests = (List<Reimbursements>) session.getAttribute("Reimbursements");
				session.setAttribute("Reimbursements", approvedRequests);
				response.sendRedirect("ManagerHomePage.html");
			} else {
				
				response.sendRedirect("ManagerHomePage.html");

			}
		} else {
			response.sendRedirect("ManagerHomePage.html");
		}

		
	}

		
	}


