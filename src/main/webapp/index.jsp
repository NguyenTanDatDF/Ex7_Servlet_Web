<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Join email list</title>
<link rel="stylesheet" href="style/style.css" type="text/css"/>
</head>
<body>
<div class="container">
 <h1>Join our email list</h1>
    <p>To join our email list, enter your name and
       email address below.</p>
       <p>Try with dat@gmail</p>
    <p>${existString}</p>
    <p>${errorString } </p>
    <form action="CheckUser" method="post">
        <input type="hidden" name="action" value="add">        
        <label class="pad_top">Email:</label>
        <input type="email" name="email"  required><br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName"  required><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName"  required><br>        
        <label>&nbsp;</label>
        <input type="submit" class="submit" value="Join Now" class="margin_left">
    </form>
</div>
</body>
</html>