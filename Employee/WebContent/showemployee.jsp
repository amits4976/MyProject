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
			<h1>About Your Employee :</h1><br>
			<form action="ShowEmployee" method=get>
				<label>Enter Employee Id: </label><input type="number" name="id" placeholder="Enter Employee Id" autocomplete="off"  required="required"><br><br>
				<input type="submit">
			</form>
				<img src="images/search.png" style="width:28%"/>
		</center>
     </body>
</html>