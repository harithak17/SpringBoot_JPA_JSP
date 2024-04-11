<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
</head>
<body>
	<h2>Employee List</h2>
	<table>
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Job Title</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employee_list }" var="employee">
				<tr>
					<td>${employee.employeeId }</td>
					<td>${employee.firstName }</td>
					<td>${employee.lastName }</td>
					<td>${employee.email }</td>
					<td>${employee.phone }</td>
					<td>${employee.jobTitle }</td>
					<td><a class="btn btn-primary"
						href="/employee/${employee.employeeId}" role="button">Update</a>
					</td>
					<td><a class="btn btn-primary"
						href="/employee/delete/${employee.employeeId }" role="button">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a class="btn btn-primary" href="/employee" role="button">Add
		New Employee</a>
</body>
</html>