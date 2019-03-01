package com.employee.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.dao.implement.*;
import com.employee.model.Pojo;

/**
 * Servlet implementation class EmployeeProject
 */
@WebServlet("/EmployeeProject")
public class EmployeeProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
		
		Pojo p = new Pojo();
		p.setEmployeeId(id);
		DaoImplementation dao = new DaoImplementation();
		ArrayList<Pojo> count = (ArrayList<Pojo>) dao.showEmployeeProject(p);
		System.out.println("count ShowEmployee "+p.getEmployeeSalary());
		if(count.isEmpty())
		{
			response.sendRedirect("error.jsp");
		}else {
			
			 request.setAttribute("employeedata", count);
			 request.getRequestDispatcher("showemployeeproject.jsp").forward(request, response);	
		}
	}

}
