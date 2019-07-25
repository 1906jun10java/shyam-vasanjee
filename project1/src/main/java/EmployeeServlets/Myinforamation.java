package EmployeeServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.revature.project1.beans.Employee;
import com.revature.project1.services.EmployeeServices;

public class Myinforamation extends HttpServlet {
	private EmployeeServices es;
	private ObjectMapper om;
	private static final long serialVersionUID = 1L;

	public Myinforamation() {
		es = new EmployeeServices();
		om = new ObjectMapper();
		om.registerModule(new JavaTimeModule());

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("EmployeeHome");
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("Employee Id");
		try {
			Employee e = es.getEmployeebyId(id);
			String empJSON = om.writeValueAsString(e);
			if (!empJSON.equals("null")) {
				response.getWriter().write(empJSON);
			} else {
				response.sendRedirect("EmployeeHome");
			}
		} catch (Exception e) {

			response.sendRedirect("EmployeeHome");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);


	}
}
