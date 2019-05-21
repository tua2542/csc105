<%--
  Created by IntelliJ IDEA.
  User: uruckcharti
  Date: 2019-04-30
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
    <head>
        <title>UKRIT BANK::ADD ACCOUNT</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
              crossorigin="anonymous">
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
        <h1>Add New Account</h1>
        <form action="CreateAccountServlet" method="post">
            <table>
                <tr>
                    <td>Account Number</td>
                    <td></td>
                    <td><input type="number" required name="accountNumber"></td>
                </tr>
                <tr>
                    <td>Account Name</td>
                    <td></td>
                    <td><input type="text" required name="accountName"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td></td>
                    <td><input type="text" required name="address"></td>
                </tr>
                <tr>
                    <td>District</td>
                    <td></td>
                    <td><input type="text" required name="district"></td>
                </tr>
                <tr>
                    <td>Province</td>
                    <td></td>
                    <td><input type="text" required name="province"></td>
                </tr>
                <tr>
                    <td>Phone Number</td>
                    <td></td>
                    <td><input type="number" required name="phoneNumber"></td>
                </tr>
                <tr>
                    <td>Amount</td>
                    <td></td>
                    <td><input type="amount" required name="amount"></td>
                </tr>
            </table>
            <input type="submit" value="Create Account">
        </form>
        <h3>RESULT</h3>
        <h4>${account.executeMessage}</h4>
    </body>
</html>
