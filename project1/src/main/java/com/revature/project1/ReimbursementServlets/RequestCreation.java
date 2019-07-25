package com.revature.project1.ReimbursementServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.beans.Reimbursements;
import com.revature.project1.services.ReimbsService;
import com.revature.project1.services.Verification;

@WebServlet("/RequestCreation")
public class RequestCreation extends HttpServlet {

	/**
	* 
	*/
	private static final long serialVersionUID = -6216785946872039183L;
	private ReimbsService rs = new ReimbsService();

	public RequestCreation() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("RequestForm.html").forward(request, response);
		// start session
		try {

			HttpSession session = request.getSession(false);
			int Rid = rs.IDgenerator();
			double amount = Verification.convertToDouble(request.getParameter("reimbursementAmount"));
			int Eid = Integer.valueOf(request.getParameter("id"));
			String FirstName = request.getParameter("FirstName");
			String LastName = request.getParameter("LastName");
			Reimbursements r = rs.addRequest(Rid, amount, "pending", Eid, FirstName, LastName);
			// session.setAttribute("problem", "invalid values");
			response.sendRedirect("EmployeeHome");
			System.out.println("Request: " + r);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
