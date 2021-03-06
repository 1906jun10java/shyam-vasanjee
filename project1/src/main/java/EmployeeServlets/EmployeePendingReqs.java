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
import com.revature.project1.beans.Reimbursements;
import com.revature.project1.services.ReimbsService;


@WebServlet("/EmployeePendingReqs")
public class EmployeePendingReqs extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ObjectMapper om; 
    private ReimbsService es;
   
    public EmployeePendingReqs() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		es = new ReimbsService();
		om = new ObjectMapper();
		int id = Integer.parseInt(session.getAttribute("id").toString());
		System.out.println("id:"+id );
		List<Reimbursements> empStatusReimbs = es.getReimByStatnID(id, "pending");
		response.getWriter().write(om.writeValueAsString(empStatusReimbs));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
