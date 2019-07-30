package com.revature.project1.ReimbursementServlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.DAO.ReimbursementsDAO;
import com.revature.project1.beans.Reimbursements;
import com.revature.project1.services.ReimbsService;
import com.revature.project1.services.Verification;

@WebServlet("/RequestCreation")
public class RequestCreation extends HttpServlet {

	/**
	* 
	*/
	private static final long serialVersionUID = -6216785946872039183L;
	ReimbursementsDAO rd = new ReimbursementsDAO();
	private ReimbsService rs = new ReimbsService();
	//HttpSession session = null;

	public RequestCreation() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//session = request.getSession(false);
		request.getRequestDispatcher("RequestForm.java").forward(request, response);
//		if (session != null) {
//			response.sendRedirect("EmployeeHome");
//		} else {
//			response.sendRedirect("LoginPage");
//		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In the post and RequestCreation outside");

		System.out.println("In the post and RequestCreation");
					HttpSession session = request.getSession();

			int Rid = rs.IDgenerator();
			
			double amount = Double.parseDouble(request.getParameter("reimbursementAmount"));
		
			int Eid = Integer.parseInt(session.getAttribute("id").toString());
			
			String FirstName = session.getAttribute("firstname").toString();
			String LastName = session.getAttribute("lastname").toString();
			Reimbursements r = new Reimbursements(Rid, amount, "pending", Eid, FirstName, LastName);
			System.out.println(r);
			rs.addRequest(r);
			response.sendRedirect("EmployeeHomePage");
		}
			
		

	}
