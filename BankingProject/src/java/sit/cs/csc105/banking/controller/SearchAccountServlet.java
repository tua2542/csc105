package sit.cs.csc105.banking.controller;

import sit.cs.csc105.banking.model.AccountOperation;
import sit.cs.csc105.banking.model.BankAccount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SearchAccountServlet", urlPatterns = "/SearchAccountServlet")
public class SearchAccountServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            String accountNumber = request.getParameter("accountNumber");
            System.out.println("PARAMETER::"+accountNumber);
            BankAccount bankAccount = new BankAccount();
            AccountOperation accountOperation = new AccountOperation();
            bankAccount = accountOperation.searchByAccountNumber(accountNumber);
           System.out.println("accountName "+bankAccount.getAccountName());
            request.setAttribute("account", bankAccount);
            getServletContext().getRequestDispatcher("/SearchAccount.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
