<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Expense</h1>

<form:form action="${contextRoot}/expense" method="post" modelAttribute="expense">
<form:hidden path="id"/>
<table>
<tr>
<td>Expense Name:</td>
<td><form:input path = "expensename" placeholder = "Enter Expense name"/></td>
</tr>
<tr>
<td>Expense Amount:</td>
<td><form:input path = "amount" placeholder = "Enter Expense Amount"/></td>
</tr>
<tr>
<td>Expense Note:</td>
<td><form:input path = "note" placeholder = "Enter note (optional)"/></td>
</tr>
</table>
<button type="submit">Add Expense</button>

</form:form> 

</body>
</html>