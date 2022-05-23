<%@ page import="com.example.demo.entity.Account" %><%
    Account account = new Account();
%><!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-blue">
    <h2>Register Form</h2>
</div>

<form action="/register" method="post" class="w3-container">
    <p>
        <label>User Name</label>
        <input class="w3-input" name="userName" type="text"></p>
    <p>
        <label>Password</label>
        <input class="w3-input" name="password" type="password"></p>
    <p>
        <label>Confirm Password</label>
        <input class="w3-input" name="confirmPassword" type="password"></p>
    <p>
        <label>Full Name</label>
        <input class="w3-input" name="fullName" type="text"></p>
    <p>
        <label>Email</label>
        <input class="w3-input" name="email" type="text"></p>
    <p>
        <label>Phone</label>
        <input class="w3-input" name="phone" type="text"></p>
    <p>
        <label>Birthday</label>
        <input class="w3-input" name="birthday" type="text"></p>
        <button type="submit" class="w3-btn w3-blue">Register</button>
        <button type="reset" class="w3-btn w3-blue">Reset</button>
</form>

</body>
</html>