<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<style>
	.error {
    color: red;
    font-style: italic;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<h1>Add New Product</h1>
	<form:form action="saveProducts" method="post" modelAttribute="product">
	<table>
		<tr>
			<td>Product Name</td>
			<td><form:input type="text" path="prodName" /></td>
		</tr>
		<tr>
		<td>Product Quantity</td>
			<td><form:input type="number" path="prodQty" /></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><form:input type="text" path="prodPrice" /></td>
		</tr>		
		<tr>
			<td></td>
			<td><input type="submit" value="Add Product"/></td>
		</tr>
	</table>
	</form:form>
</body>
</html>