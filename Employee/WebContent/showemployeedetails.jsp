<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.employee.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employee Management System</title>
	</head>
    <body>
			<a href="showemployee.jsp">Back</a>
			<div>
			<center>
				<h1>Employee Details</h1>
<%
				ArrayList<Pojo> viewEmployee = (ArrayList<Pojo>)request.getAttribute("employeedata");
				Pojo p=null;
				for(int i=0;i<viewEmployee.size();i++)
				{
					p=viewEmployee.get(i);
					out.println("Employee Id: "+p.getEmployeeId()+"<br/><br/>");
					out.println("Employee Name: "+p.getEmployeeName()+"<br/><br/>");
				    out.println("Employee Salary: " +p.getEmployeeSalary()+"<br/><br/>");
			     }
%>
			</center>
			</div>
				<div style="margin-left: 65%;">
				<img src="images/employee.png"/>
			</div>
	  </body>
</html>