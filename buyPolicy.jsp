<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="policyform" method="post">
	<label>User Id : </label>
			<input type="number" name="uid">
		<br>
			<br>
	
	
		<label for="policyname">Choose a policy:</label>
		 <select name="policyname" >
			<option value="Life Insurance">Life insurance</option>
			<option value="Retirement Plans">Retirement plans</option>
			<option value="Health Insurance">Health insurance</option>
			<option value="Child Insurance Plans">Child insurance plans</option></select>
			<br>
			<br>
			<label>Insurance Tenure in years : </label>
			<input type="number" name="years">
		<br>
			<br>
			<label>Premium Amount : </label>
			<input type="number" name="amount">
		<br>
			<br>
			<label> Sum Insured : </label>
			<input type="number" name="sum">
		<br>
			<br>
			<input type="submit" value="Buy">
	</form>
	
</body>
</html>