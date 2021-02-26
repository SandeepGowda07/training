<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Form</title>
</head>
<body>
<%@ page import="com.dao.*" %>
<%
String id=request.getParameter("UserId");
Userdao.delete(Integer.parseInt(id));
response.sendRedirect("Admin.jsp");
%>
</body>
</html>