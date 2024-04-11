<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product</title>
</head>
<body>
<h1>View Product Details</h1>
<table>
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>Product Quantity</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="pdt" items="${prod}">
		<tr>
			<td>${pdt.prodId}</td>
			<td>${pdt.prodName}</td>
			<td>${pdt.prodPrice}</td>
			<td>${pdt.prodQty}</td>
			<td><a href="viewProdById/${pdt.prodId}">Edit</a></td>
			<td><a href="delProdById/${pdt.prodId}">Delete</a></td>
		</tr>		
	</c:forEach>
</table>
</body>
</html>