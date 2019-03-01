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
	
				<pre>
				
					<form action ="AddProject" method="post" >
					
					<div>
						<h1>Add Project Form</h1>
						Project Name: <input type="text" name="name"  pattern="[A-Za-z0-9]+" title="Only alphabets and numbers are allowed"   autocomplete="off" placeholder="Enter Name"  required="required"><br>
						Assign To   : <input type="number" name="assign_to" autocomplete="off" placeholder="Assign To"  required="required"><br>
						<input type ="submit" value="Add Project">
					</div>
					</form>
				</pre>
					<img src="" style="width: 23%;"/>
			</center>
	      </body>
</html>