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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>My Simple Calculator</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Calculator Form</h1>\n");
      out.write("\t\t<form action=\"SimpleCalc\" method=\"post\" >\n");
      out.write("\t\t\tx = <input type = \"number\" name= \"x\" required><br>\n");
      out.write("\t\t\toperator : <select name= \"operator\" >\n");
      out.write("\t\t\t\t<option value=\"+\">PLUS </option>\n");
      out.write("\t\t\t\t<option value=\"-\">MINUS </option>\n");
      out.write("\t\t\t\t<option value=\"*\">PRODUCT </option>\n");
      out.write("\t\t\t\t<option value=\"/\">DIVIDE</option>\n");
      out.write("\t\t\t</select><br>\n");
      out.write("\t\t\ty = <input type=\"number\" name =\"y\" required> <br>\n");
      out.write("\t\t\t<input type =\"submit\" value =\"calculate it !!!\"/>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
