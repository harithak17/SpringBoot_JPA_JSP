<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="jakarta.tags.core" prefix="c" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Customer Details</title>
</head>
<body>
<h1>View Customer Details</h1>
<table>
	<tr>
		<th>Customer Id</th>
		<th>Customer Name</th>
		<th>Customer Gender</th>
		<th>Customer Email</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="cst" items="${cust}">
		<tr>
			<td>${cst.custId}</td>
			<td>${cst.custName}</td>
			<td>${cst.custGender}</td>
			<td>${cst.custEmail}</td>
			<td><a href="viewCustById/${cst.custId}">Edit</a></td>
			<td><a href="delCustById/${cst.custId}">Delete</a></td>
			<td><a href="viewCustByEmail/${cst.custEmail}">Search by Email</a></td>
		</tr>		
	</c:forEach>
</table>
</body>
</html>