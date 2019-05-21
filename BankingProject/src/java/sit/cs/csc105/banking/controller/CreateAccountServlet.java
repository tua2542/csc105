package sit.cs.csc105.banking.controller;

import sit.cs.csc105.banking.model.AccountOperation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateAccountServlet", urlPatterns = "/CreateAccountServlet")
public class CreateAccountServlet extends javax.servlet.http.HttpServlet
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try (PrintWriter out = response.getWriter())
        {
            String accountNumber = request.getParameter("accountNumber");
            String accountName = request.getParameter("accountName");
            String address = request.getParameter("address");
            String district = request.getParameter("district");
            String province = request.getParameter("province");
            String phoneNumber = request.getParameter("phoneNumber");
            String amount = request.getParameter("amount");
            AccountOperation accountOperation = new AccountOperation();
            accountOperation.addAccount(accountNumber, accountName, address, district, province, phoneNumber, amount);
            request.setAttribute("account", accountOperation);
            getServletContext().getRequestDispatcher("/AddAccount.jsp").forward(request, response);
            
        }
    }
    
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException
    {
        processRequest(request, response);
    }
    
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException
    {
        processRequest(request, response);
    }
	
}
