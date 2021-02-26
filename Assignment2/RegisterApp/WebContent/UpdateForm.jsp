<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@ page import="com.dao.*,java.util.*" %>
<%
String id=request.getParameter("UserId");
User u=Userdao.getRecordById(Integer.parseInt(id));
%>
<h1>Edit Form</h1>
<form action="UpdateServlet" method="post">
<input type="hidden" name="id" value="<%=u.getUserId()%>"/>
<table>
<tr><td>UserId:</td><td><input type="number" name="userid" value="<%=u.getUserId() %>"/></td></tr>
<tr><td>UserName:</td><td><input type="text" name="uname" value="<%=u.getUserName() %>"/></td></tr>
<tr><td>EmailId:</td><td><input type="Email" name="email" value="<%=u.getEmailId() %>"/></td></tr>
<tr><td>DOB:</td><td><input type="date" name="dob" value="<%=u.getDob() %>"/></td></tr>
<tr><td>Age:</td><td><input type="number" name="age" value="<%=u.getAge() %>"/></td></tr>
<tr><td>Password:</td><td><input type="number" name="pass" value="<%=u.getPassword() %>"/></td></tr>
<tr><td><input type="submit"value="submit"/></td></tr>
</table>

</form>
</body>
</html>