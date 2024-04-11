<%@page import="org.springboot.jpa.jsp.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit customer</title>
</head>
<body>
	<h1>Edit Customer Details</h1>
	<form action="/editcust" method="post">
		<table border="1">
			<tr>
				<td>Customer Id</td>
				<td><input type="text" name="custId" value="${custm.custId}"/></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="custName" value="${custm.custName}"/></td>
			</tr>
			<%
				Customer cust=(Customer)request.getAttribute("custm"); 
				String gen=cust.getCustGender();
			%>
			<tr>
				<td>Customer Gender</td>
				<td>
				<%
					if(gen.equals("Male"))
						{
					%>		
							<input type="radio" name="custGender" checked="checked" value="Male"/>Male
							<input type="radio" name="custGender"  value="Female"/>Female
							<input type="radio" name="custGender"  value="Others"/>Others
						
					<% 
					}else if(gen.equals("Female"))
						{
					%>
					<input type="radio" name="custGender"  value="Male"/>Male			
					<input type="radio" name="custGender" checked="checked" value="Female"/>Female
					<input type="radio" name="custGender"  value="Others"/>Others
					<%		
						}
						else if(gen.equals("Others"))
						{
						%>
					<input type="radio" name="custGender"  value="Male"/>Male
					<input type="radio" name="custGender"  value="Female"/>Female	
					<input type="radio" name="custGender" checked="checked" value="Others"/>Others
					<%		
						}
					%>
				</td>
			</tr>
			<tr>
				<td>Customer Mail</td>
				<td><input type="text" name="custEmail" value="${custm.custEmail}"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Edit Customer"/></td>
			</tr>
		</table>
	</form>
</body>
</html>