<%--
  Created by IntelliJ IDEA.
  User: uruckcharti
  Date: 2019-04-29
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
    <head>
        <title>Ukrit Bannk</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
              crossorigin="anonymous">
		<link rel="stylesheet" href="signin.css">
    </head>
    <body>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
                crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
                crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
                crossorigin="anonymous"></script>
	<center>
        <h1>Welcome to Tua Bank</h1>
        <a href="AddAccount.jsp">Add Account</a> <br>
        <a href="SearchAccount.jsp">Search Account</a>
	</center>
<form action="LoginServlet" method="post">
	
	<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <br>
	<br>
    <!-- Icon -->
    <div class="fadeIn first">
      <img src="img/bank.png" id="icon" alt="User Icon" />
    </div>
	<br>
	<br>

    <!-- Login Form -->
    <form>
      <input type="number" id="login" class="fadeIn second" required name="accountNumber" placeholder="login">
      <input type="password" id="password" class="fadeIn third" required name="password" placeholder="password">
	  <br>
	<br>
      <input type="submit" class="fadeIn fourth" value="login">
    </form>
     
    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>
<!--	
	
	
	Account Number<br>
	<input type="number" required name="accountNumber">
	Password<br>
	<input type="password" required name="password">
	<input type="submit" value="login">-->
</form>
    </body>
</html>