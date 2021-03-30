<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<center>
	<h2>Please Enter User/name and Password</h2>
	<p>
		<form method="post" action="j_spring_security_check">
			<table border="1">
				<tr>
					<td>UserName : </td>
					<td><input type="text" name="j_username"/></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="password" name="j_password"/></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="Submit"></td>
				</tr>			
			</table>
		</form>
	</p>
</center>
</body>
</html>