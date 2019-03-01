<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
		<title>Employee Management System</title>
	
	    <style>
		    ul {
  				 list-style-type: none;
  				 margin: 0;
 				 padding: 0;
				 overflow: hidden;
				 background-color: #333333;
				 height: 55px;
				}

					li {
  						 float: left;
						}

					li a {
  							display: block;
  							color: white;
 						    text-align: center;
  							padding: 16px;
  							text-decoration: none;
						  }

                      li a:hover {
                                    background-color: #111111;
                                 }
		 </style>
	</head>
		<body>
				<ul >
						<li><a href="AddEmployee.jsp">Add Employee</a> <br><br></li>
						<li><a href="updateemployee.jsp">Update Employee</a> <br><br></li>
						<li><a href="deleteemployee.jsp">Delete Employee</a> <br><br></li>
						<li><a href="showemployee.jsp">Search Employee</a> <br><br></li>
	
						<li><a href="addproject.jsp">Add Project</a> <br><br></li>
						<li><a href="showalldetails.jsp">View All Employee</a> <br><br></li>
						<li><a href="employeeproject.jsp">Employee Project</a> <br><br></li>
				</ul>
				
						<center>
									<h1>Employee Management System</h1>

									<img src="images\Employee-Database-Management-System.jpg"/>
						</center>	

		</body>
</html>