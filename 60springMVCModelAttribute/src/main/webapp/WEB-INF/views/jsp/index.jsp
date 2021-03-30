<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Country Info</title></head>
<body>
<center>
		<h1>
			Welcome to SadaLearningHub<br />
			<br />This Example demonistrate the @ModelAttribute
		</h1>
<table>
  <form:form action="submit" method="post" commandName="msg">
	<tr>  <td>Enter Your Message : </td> <td><form:input  path="msgValue"/> </td> </tr> 
	<tr> <td colspan=2>   <input type="submit"> </td>
  </form:form>
</table> 
</center>  
</body>
</html> 