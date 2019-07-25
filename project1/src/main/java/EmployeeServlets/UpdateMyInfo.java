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
import com.revature.project1.services.EmployeeServices;


@WebServlet("/UpdateMyInfo")
public class UpdateMyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ObjectMapper om;
       private EmployeeServices es;
    
    public UpdateMyInfo() {
        es = new EmployeeServices();
        om = new ObjectMapper();
		om.registerModule(new JavaTimeModule());
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String idString = request.getParameter("Employee Id");
		if (idString != null) {
			try {
				int id = Integer.parseInt(idString);
				request.setAttribute("Employee", es.getEmployeebyId(id));
				String empJSON = om.writeValueAsString(es.getEmployeebyId(id));
				if (!empJSON.equals("null")) {
					response.getWriter().write(empJSON);
				} else {
					response.sendRedirect("EmployeeHome");
				}
			} catch (Exception e) {
				response.sendRedirect("EmployeeHome");
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
