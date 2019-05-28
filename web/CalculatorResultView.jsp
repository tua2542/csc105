<%-- 
    Document   : CalculatorResultView
    Created on : Apr 10, 2019, 4:02:54 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Calculator Result</title>
    </head>
    <body>
        <h1>RESULT :: </h1>
		<table>
			<tr>
				<td>x</td>
				<td>=</td>
				<td>${calculator.x}</td>
			</tr>
			<tr>
				<td>operator</td>
				<td>=</td>
				<td>${calculator.operator}</td>
			</tr>
			<tr>
				<td>y</td>
				<td>=</td>
				<td>${calculator.y}</td>
			</tr>
			<tr>
				<td>Result</td>
				<td>=</td>
				<td>${calculator.result}</td>
			</tr>
		</table>
    </body>
</html>
