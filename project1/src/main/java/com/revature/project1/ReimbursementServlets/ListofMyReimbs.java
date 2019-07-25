package com.revature.project1.ReimbursementServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.revature.project1.beans.Reimbursements;
import com.revature.project1.services.ReimbsService;


@WebServlet("/ListofMyReimbs")
public class ListofMyReimbs extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReimbsService rs;
	private ObjectMapper om;

	
    
    public ListofMyReimbs() {
        
        om = new ObjectMapper();
		om.registerModule(new JavaTimeModule());
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try{
			if(request.getParameter("Employee Id") != null) {
		int id = (int)request.getAttribute("Employee Id");
		Reimbursements r = rs.getReimbsID(id);
		
		String henchmanJSON = om.writeValueAsString(r);
		if(!henchmanJSON.equals("null")) {
			response.getWriter().write(henchmanJSON);
		}
			}else {
				response.sendError(400);
			}
		
		}catch(Exception e) {
			response.sendError(400);
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
