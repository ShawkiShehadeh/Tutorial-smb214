<%-- 
    Document   : login
    Created on : Oct 18, 2015, 4:24:54 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
    <form action="j_security_check" method="POST">
        Username:<input type="text" name="j_username"><br>
        Password:<input type="password" name="j_password">
        <input type="submit" value="Login">
    </form>
</html>
