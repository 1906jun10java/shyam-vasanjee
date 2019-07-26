package com.revature.project1.ReimbursementServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.project1.beans.Reimbursements;
import com.revature.project1.services.ReimbsService;

/**
 * Servlet implementation class ApprovedRequest
 */
@WebServlet("/ApprovedRequest")
public class ApprovedRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReimbsService rs;
	private ObjectMapper om;

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
		int id = Integer.parseInt(request.getParameter("id"));
		Reimbursements r = rs.updateReimbStatus(id, "approved");
		if (session != null) {
				response.getWriter().write(om.writeValueAsString(r.toString()));
			} else {

				response.sendRedirect("ManagerHomePage.html");

			}
		} 
	}

