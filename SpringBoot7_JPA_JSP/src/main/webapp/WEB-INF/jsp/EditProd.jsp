<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
	<h1>Edit Product Details</h1>
	<form action="/editProd" method="post">
		<table>
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="prodId" value="${prod.prodId}"/></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="prodName" value="${prod.prodName}"/></td>
			</tr>
			<tr>
				<td>Product Quantity</td>
				<td>
					<input type="number" name="prodQty" value="${prod.prodQty}"/>
				</td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="text" name="prodPrice" value="${prod.prodPrice}"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Edit Product"/></td>
			</tr>
		</table>
	</form>
</body>
</html>