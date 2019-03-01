package com.employee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.employee.model.Pojo;
import com.employee.dao.implement.*;

@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// receives the request from the service method, and dispatches the request to
	// the doXXX() method depending on the incoming http request type.
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String name = request.getParameter("name");
			Float salary = Float.parseFloat(request.getParameter("salary"));
			Pojo p = new Pojo();
			p.setEmployeeName(name);
			p.setEmployeeSalary(salary);

			DaoImplementation d = new DaoImplementation();
			System.out.println("calling DaoImplementation ");
			int count = d.addEmployee(p);
			if (count == 0) {
				response.sendRedirect("error.jsp");
			} else {
				response.sendRedirect("success.jsp");
			}
		} catch (Exception e) {
			response.sendRedirect("error.jsp");
		}

	}

}
