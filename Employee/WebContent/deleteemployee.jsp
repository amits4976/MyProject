<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee Management System</title>
	</head>
		<body>
			<a href="index.jsp">Home</a>
			<center>
				<h1>Delete Employee Details</h1>
			    <form action="DeleteEmployee" method="post">
					<label>Enter Employee Id : </label><input type="number" name="delete_id" placeholder="Enter id"  required="required"/> <br><br><br>
				    <input type="submit" /><br><br><br>
				</form>
					<img src="images/delete.png" style="width:25%"/>
			</center>
		</body>
</html>