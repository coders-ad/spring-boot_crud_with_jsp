<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Home </h1>
<c:forEach var="exp" items="${expenses}">
<div>
<table border="1">
<tr>
<th>Expense ID</th>
<th>Expense Name</th>
<th>Expense Amount</th>
<th>Action</th>
</tr>
<tr>
<td>${exp.id}</td>
<td>${exp.expensename}</td>
<td>&#837;${exp.amount}</td>
<td><a href = "${contextRoot}/expense/${exp.id}">Edit</a>
<a href = "${contextRoot}/delete/${exp.id}">Delete</a></td>
</tr>
</table>

</div>
</c:forEach>
<a href="/expense">Add Expense</a>
</body>
</html>