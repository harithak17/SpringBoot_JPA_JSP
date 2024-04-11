<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Student Details</title>
</head>
<body>
<h1>Enter Student Details</h1>
<form action="viewstud" method="post">
	<table>
		<tr>
			<td>Student Id</td>
			<td><input type="text" name="stud_Id"></td>
		</tr>
		<tr>
			<td>Student Name</td>
			<td><input type="text" name="stud_Name"></td>
		</tr>
		<tr>
			<td>Student Course</td>
			<td><input type="text" name="stud_Course"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Register"></td>
		</tr>
	</table>
</form>
</body>
</html>