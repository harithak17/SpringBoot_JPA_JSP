<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="employeeForm" method="post" action="employee/save">
		<form:hidden path="employeeId" />
		<table>
		<tr>
			<td>First Name</td>
			<td><form:input path="firstName" id="firstName" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>
				<form:input path="lastName" id="lastName" />
			</td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email" id="email" /></td>
		</tr>
		<tr>
			<td>Phone</td>
			<td><form:input path="phone" id="phone" /></td>
		</tr>
		<tr>
			<td>Job Title</td>
			<td><form:input path="jobTitle" id="jobTitle" /></td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="Save"></td>
		</tr>
		</table>
	</form:form>
</body>
</html>