<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="showDashboard" method="post">
	<label>Login ID :</label>
	<input type="number" name="userid" required="required">
	<br>
	<br>
	<label>Password :</label>
	<input type="password" name="userpassword" required="required">
	<br>
	<br>
	<input type="submit" value="Login">
	</form>
	
</body>
</html>