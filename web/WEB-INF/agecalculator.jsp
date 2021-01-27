<%-- 
    Document   : AgeCalculator
    Created on : 26-Jan-2021, 12:26:15 PM
    Author     : 814545
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="AgeCalculator" method="post">
            Enter your age: <input type="text" name="currentAge" value = ${currentAge}><br>
            <input type="submit" value="Age next birthday">
            <p>${nextAge}</p>
        </form>
        <a href ="ArithmeticCalculator">Arithmetic Calculator</a>
    </body>
</html>
