<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="submitDelInfo" method="post">
	<label for="polName">Choose a policy:</label>
		 <select name="polName" >
			<option value="Life Insurance">Life insurance</option>
			<option value="Retirement Plans">Retirement plans</option>
			<option value="Health Insurance">Health insurance</option>
			<option value="Child Insurance Plans">Child insurance plans</option></select>
			<br>
			<br>
	<input type="submit" value="Delete">
	</form>
	
</body>
</html>