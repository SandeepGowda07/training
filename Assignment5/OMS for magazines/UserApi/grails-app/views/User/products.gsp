<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="layout" content="main"/>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>List of Magazines</h1>
</div>
<table>
    <tr>
        <td>MagazineId</td><td>Magazine_name</td><td>Magazine_price</td><td>publish_date</td><td>Place_Order</td>
    </tr>
    <g:each in="${product}" var="prod">
        <tr>
            <td>${prod.id}</td>
            <td>${prod.name}</td>
            <td>${prod.price}</td>
            <td>${prod.publish_date}</td>
            <td><a href="customer?prodid=${prod.id}">Order</a></td>
        </tr>
    </g:each>
</table>


</body>
</html>