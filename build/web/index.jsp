<%-- 
    Document   : index
    Created on : Apr 10, 2019, 3:36:09 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Simple Calculator</title>
    </head>
    <body>
        <h1>Calculator Form</h1>
		<form action="SimpleCalc" method="post" >
			x = <input type = "number" name= "x" required><br>
			operator : <select name= "operator" >
				<option value="+">PLUS </option>
				<option value="-">MINUS </option>
				<option value="*">PRODUCT </option>
				<option value="/">DIVIDE</option>
			</select><br>
			y = <input type="number" name ="y" required> <br>
			<input type ="submit" value ="calculate it !!!"/>
			
		</form>
    </body>
</html>
