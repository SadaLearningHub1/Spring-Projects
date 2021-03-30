<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page isELIgnored="false" %>

<html>
<body>
	<h3>Exception Page</h3>
	<p>
		Exception Message:<br />${exceptionMessage}
	</p>
	<p>
		Exception type:<br />${exceptionName}
	</p>
</body>
</html>