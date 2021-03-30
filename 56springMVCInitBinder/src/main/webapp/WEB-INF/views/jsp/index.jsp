<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<html>
<head>
<style>
span.error {
   color: red;
}
</style>
</head>
<body>

<h3> Registration Form <h3>
<br/>
 <frm:form action="register" method="post" commandName="student">
  <pre>
                  Student Name <frm:input path="name" />
                       <frm:errors path="name" cssClass="error" />

         Student Date of Birth <frm:input path="dateOfBirth" type="date"/>
                       <frm:errors path="dateOfBirth" cssClass="error" />

         Student Email address <frm:input path="emailAddress" />
                       <frm:errors path="emailAddress" cssClass="error" />

              Password <frm:password path="password" />
                       <frm:errors path="password" cssClass="error" />
                                        <input type="submit" value="Submit" />
  </pre>
 </frm:form>
</body>
</html>