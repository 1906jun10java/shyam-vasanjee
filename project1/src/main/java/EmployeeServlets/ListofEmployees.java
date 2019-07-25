package EmployeeServlets;

import java.io.IOException;
import java.util.List;

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

/**
 * Servlet implementation class ListofEmployees
 */
@WebServlet("/ListofEmployees")
public class ListofEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeServices es;
	private ObjectMapper om;

	public ListofEmployees() {
		es = new EmployeeServices();
		om = new ObjectMapper();
		om.registerModule(new JavaTimeModule());

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		int id = (int)session.getAttribute("Employee Id");
		List<Employee> henchmen = null;
		try{
		
		Employee e = es.getEmployeebyId(id);
		henchmen = es.myHenchmen(e.getReportsTo());
		request.setAttribute("henchmen",henchmen);
		String henchmanJSON = om.writeValueAsString(henchmen);
		if(!henchmanJSON.equals("null")) {
			response.getWriter().write(henchmanJSON);
		
			}else {
				response.sendError(400);
			}
		
		}catch(Exception e) {
			response.sendError(400);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
