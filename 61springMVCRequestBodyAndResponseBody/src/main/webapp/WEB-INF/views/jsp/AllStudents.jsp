<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ page isELIgnored="false" %>
<html>
<body>
<h3> Registration done </h3>
<p>All Users</p>
<table style="width:100%">
<c:forEach var="stu" items="${students}">
<tr>
<td>
    <c:out value="${stu.name}"/>
</td>
<td>
    <c:out value="${stu.emailAddress}"/>
</td>
<td>
    <c:out value="${stu.dateOfBirth}"/>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>