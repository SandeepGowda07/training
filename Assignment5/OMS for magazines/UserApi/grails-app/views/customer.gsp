<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<% int id=(Integer.parseInt(request.getParameter("prodid")))%>
<div align="center">
    <h1>Fill the details</h1>
    <form action="save" method="post">
        <table>
            <tr><td>ProductId:</td><td><input type="text" name="prod_id" value=<%=id %> readonly="readonly"/></td></tr>
            <tr><td>Name:</td><td><input type="text" name="name" /></td></tr>
            <tr><td>Phone_no:</td><td><input type="tel" name="phone_no" /></td></tr>
            <tr><td>City:</td><td><input type="text" name="city" /></td></tr>
            <tr><td>State:</td><td><input type="text" name="state" /></td></tr>
            <tr><td>Credit_card_no:</td><td><input type="tel" name="card_no" /></td></tr>
        </table>
        <input type="submit" value="PlaceOrder"/>

    </form>
</div>

</body>
</html>