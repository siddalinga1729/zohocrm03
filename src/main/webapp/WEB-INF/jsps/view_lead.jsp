<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu_Lead.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head><br>
<body>
Id:${lead.id}<br>
FirstName:${lead.firstName}<br>
LastName:${lead.lastName}<br>
Email:${lead.email}<br>
LeadSource:${lead.leadSource}<br>
Mobile:${lead.mobile}
<form action="compose" method="post">
<input type="hidden" name="emailid" value="${lead.email}">
<input type="submit" value="Email">
</form>
<form action="convert" method="post">
<input type="hidden" name="id" value="${lead.id}">
<input type="submit" value="Convert">
</form>
</body>
</html>