<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student</title>
</head>
<body>
<center>
  <h1>Student profile Page</h1>
  <table>
    <tr>
      <td>First Name</td>
      <td>${student.fname}</td>
    </tr>
    <tr>
      <td>Middle Name</td>
      <td>${student.mname}</td>
    </tr>
    <tr>
      <td>Last Name</td>
      <td>${student.lname}</td>
    </tr>
    <tr>
      <td>Age</td>
      <td>${student.age}</td>
    </tr>
  </table>
  </center>
</body>
</html>