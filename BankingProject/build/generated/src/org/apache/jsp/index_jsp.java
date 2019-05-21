package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Ukrit Bannk</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"signin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("                integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("                integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\n");
      out.write("                integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("\t<center>\n");
      out.write("        <h1>Welcome to Tua Bank</h1>\n");
      out.write("        <a href=\"AddAccount.jsp\">Add Account</a> <br>\n");
      out.write("        <a href=\"SearchAccount.jsp\">Search Account</a>\n");
      out.write("</center>\n");
      out.write("<form action=\"LoginServlet\" method=\"post\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"wrapper fadeInDown\">\n");
      out.write("  <div id=\"formContent\">\n");
      out.write("    <!-- Tabs Titles -->\n");
      out.write("    <br>\n");
      out.write("\t<br>\n");
      out.write("    <!-- Icon -->\n");
      out.write("    <div class=\"fadeIn first\">\n");
      out.write("      <img src=\"img/bank.png\" id=\"icon\" alt=\"User Icon\" />\n");
      out.write("    </div>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("    <!-- Login Form -->\n");
      out.write("    <form>\n");
      out.write("      <input type=\"number\" id=\"login\" class=\"fadeIn second\" required name=\"accountNumber\" placeholder=\"login\">\n");
      out.write("      <input type=\"password\" id=\"password\" class=\"fadeIn third\" required name=\"password\" placeholder=\"password\">\n");
      out.write("\t  <br>\n");
      out.write("\t<br>\n");
      out.write("      <input type=\"submit\" class=\"fadeIn fourth\" value=\"login\">\n");
      out.write("    </form>\n");
      out.write("     \n");
      out.write("    <!-- Remind Passowrd -->\n");
      out.write("    <div id=\"formFooter\">\n");
      out.write("      <a class=\"underlineHover\" href=\"#\">Forgot Password?</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!--\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tAccount Number<br>\n");
      out.write("\t<input type=\"number\" required name=\"accountNumber\">\n");
      out.write("\tPassword<br>\n");
      out.write("\t<input type=\"password\" required name=\"password\">\n");
      out.write("\t<input type=\"submit\" value=\"login\">-->\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
