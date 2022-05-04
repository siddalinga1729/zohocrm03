<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu_Lead.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<a href="view">Create New Lead</a>
	<h3>List Of Leads</h3>
	<table border="2">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>LeadSource</th>
			<th>Mobile</th>
		</tr>
		<c:forEach items="${leads}" var="lead">
		<tr>
		<td>${lead.id }</td>
		<td><a href="getById?id=${lead.id }">${lead.firstName }</a></td>
		<td>${lead.lastName }</td>
		<td>${lead.email }</td>
		<td>${lead.leadSource }</td>
		<td>${lead.mobile }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>