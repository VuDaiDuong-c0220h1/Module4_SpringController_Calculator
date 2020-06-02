<%--
  Created by IntelliJ IDEA.
  User: Vu Dai Duong
  Date: 6/2/2020
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="get">
    <input type="text" name="opr_1" value=""><input type="text" name="opr_2" value="">
    <input type="submit" name="operator" value="Addition(+)"><input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(X)"><input type="submit" name="operator" value="Division(/)">
</form>
<h2>Message:${message}</h2>
<h2>Result:${result}</h2>
</body>
</html>
