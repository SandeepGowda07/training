<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="index.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<div align="center">
<form action="LoginServlet" method="post">
Enter UserName:<input type="text" name="uname"/><br><br>
Enter Password:<input type="password" name="pass"/><br><br><input type="submit" value="submit"/>
</form>
</div>
</body>
</html>