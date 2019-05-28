/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc105.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import csc105.model.SimpleCalculator;

/**
 *
 * @author User
 */
public class SimpleCalculatorServlet extends HttpServlet {

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			try{
			SimpleCalculator simc = new SimpleCalculator();
			simc.setX(Integer.parseInt(request.getParameter("x")));
			simc.setY(Integer.parseInt(request.getParameter("y")));
			simc.setOperator(request.getParameter("operator"));
//			String  xString = request.getParameter("x");
//			String yString = request.getParameter("y");
			request.setAttribute("calculator", simc);
			getServletContext().getRequestDispatcher
		("/CalculatorResultView.jsp").forward(request, response);
//			String Name = request.getParameter("Name");
//     		int y = Integer.parseInt(yString);
//		     int x = Integer.parseInt(xString);
//			int result = x+y;
			
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<title>My Calculator</title>");			
//			out.println("</head>");
//			out.println("<body>");
////			out.println("<h1>Servlet SimpleCalculatorServlet at " + request.getContextPath() + "</h1>");
////			out.println("<h1>"+Name+"</h1>");
////		out.println(String.format("<h1> x =%d + y = %d result is %d </h1>", x,y,result));
//			out.println(simc.toString());
//			out.println("</body>");
//			out.println("</html>");
		}catch (Exception e){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>My Calculator</title>");			
			out.println("</head>");
			out.println("<body>");
//			out.println("<h1>Servlet SimpleCalculatorServlet at " + request.getContextPath() + "</h1>");
			out.println("<h1> Error INVALID INPUT </h1>");
//			out.println(String.format("<h1> x =%d + y = %d result is %d </h1>", x,y,result));
			out.println("</body>");
			out.println("</html>");
		}
	}
	    }

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
	
