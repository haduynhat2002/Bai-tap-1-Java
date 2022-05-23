
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.demo.entity.Account" %><%
    Account account = (Account) request.getAttribute("account");
%>
<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body class="w3-container">
<div class="w3-panel w3-green">
    <h3>SUCCESS!</h3>
    <p>Đăng kí thành công </p>
</div>
<div>Thông tin tài khoản</div>
<div>Username: <%=account.getUserName()%></div>
<div>Full Name: <%=account.getFullName()%></div>
<div>Birthday: <%=account.getBirthday()%></div>
<div>Email: <%=account.getEmail()%></div>
<div>Phone: <%=account.getPhone()%></div>
</body>
</html>