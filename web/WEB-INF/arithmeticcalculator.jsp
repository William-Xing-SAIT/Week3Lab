<%-- 
    Document   : ArithmeticCalculator
    Created on : 26-Jan-2021, 12:26:42 PM
    Author     : 814545
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="ArithmeticCalculator" method="post">
            First: <input type="text" name="firstNumber" value=${firstNumber}><br>
            Second: <input type="text" name="secondNumber" value=${secondNumber}><br>
            <input type="submit" name = "symbol" value="+">
            <input type="submit" name = "symbol" value="-">
            <input type="submit" name = "symbol" value="*">
            <input type="submit" name = "symbol" value="%">
            <p>${result}</p>
        </form>
        <a href ="AgeCalculator">Age Calculator</a>
    </body>
</html>
