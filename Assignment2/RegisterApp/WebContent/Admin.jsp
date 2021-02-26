<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<%@ page import="com.dao.*,java.util.*" %>
<%! String name;String email;String Dob;int Age;String Password;int id; %>
<h1><center>Users List</center></h1>
<table border="1" align="center">
<tr><th>UserId</th><th>UserName</th><th>Email</th><th>Dob</th><th>Age</th><th>Password</th><th>Edit</th><th>Delete</th></tr>

<%
List<User> list=Userdao.getAllrecords();
Iterator it=list.iterator();
while(it.hasNext()){
	User u= (User)it.next();
	id=u.getUserId();
	name=u.getUserName();
	email=u.getEmailId();
	Dob=u.getDob();
	Age=u.getAge();
	Password=u.getPassword();

%>
<td><%=id %></td>
<td><%=name %></td>
<td><%=email %></td>
<td><%=Dob %></td>
<td><%=Age %></td>
<td><%=Password %></td>
<td><a href="UpdateForm.jsp?UserId=<%= u.getUserId() %>">Edit</a></td>
<td><a href="Delete.jsp?UserId=<%= u.getUserId() %>">Delete</a></td>
</tr>
<%} %>
</table>


</body>
</html>