<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Customer</title>
</head>
<body>
	<h1>Add New Customer</h1>
	<form action="addCust" method="post">
	<table>
		<tr>
			<td>Customer Name</td>
			<td><input type="text" name="custName"/></td>
		</tr>
		<tr>
		<td>Customer Gender</td>
			<td><input type="radio" name="custGender" value="Male"/>Male
				<input type="radio" name="custGender" value="Female"/>Female
				<input type="radio" name="custGender" value="Others"/>Others
			</td>
		</tr>
		<tr>
			<td>Customer email</td>
			<td><input type="text" name="custEmail"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Add Customer"/></td>
		</tr>
	</table>
	</form>
</body>
</html>