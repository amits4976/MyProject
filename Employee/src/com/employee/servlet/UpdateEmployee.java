package com.employee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.employee.model.*;
import com.employee.dao.implement.*;
/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Update servlet");
		
		try
		{
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			float salary = Float.parseFloat(request.getParameter("salary"));
			
			Pojo p = new Pojo();
			p.setEmployeeId(id);
			p.setEmployeeName(name);
			p.setEmployeeSalary(salary);
			DaoImplementation dao = new DaoImplementation();
			int count = dao.updateEmployee(p);
			System.out.println(p.getEmployeeSalary());
			if(count!=0)
			{
				response.sendRedirect("success.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
		}
		catch(Exception e)
		{
			response.sendRedirect("error.jsp");	
		}
		
	}

}
