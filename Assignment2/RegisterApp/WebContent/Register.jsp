<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<div align="center">
<form action="RegisterServlet" method="post">
Enter UserName:<input type="text" name="uname" required="required"/><br><br>
Enter EmailId:<input type="email" name="emailid"/><br><br>
Enter DOB:<input type="date" name="dob"/><br><br>
Enter Password:<input type="password" name="pass" required="required"/><br><br>
<input type="submit" value="submit"/>
</form>
</div>
</body>
</html>