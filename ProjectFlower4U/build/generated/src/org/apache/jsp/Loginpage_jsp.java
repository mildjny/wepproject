package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Loginpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("      <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("      <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <form action=\"login\" method=\"post\">\n");
      out.write("           <br><br><br><br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("    \t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t  \t<div class=\"panel-heading\">\n");
      out.write("\t\t\t    \t<h2 class=\"center-block\" >Please login</h2>\n");
      out.write("\t\t\t \t</div>\n");
      out.write("\t\t\t  \t<div class=\"panel-body\">\n");
      out.write("\t\t\t    \t<form accept-charset=\"UTF-8\" role=\"form\">\n");
      out.write("                             <fieldset>\n");
      out.write("\t\t\t    \t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t    <input  class=\"form-control\" placeholder=\"E-mail\" name=\"email\" type=\"text\">\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t<input  class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t\t\n");
      out.write("\t\t\t    \t\t<input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t    \t</fieldset>\n");
      out.write("\t\t\t      \t</form>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("            </form>\n");
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
