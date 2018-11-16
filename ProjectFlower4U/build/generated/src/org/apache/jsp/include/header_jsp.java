package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Header</title>\n");
      out.write("    </head>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Flower4U</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <form class=\"navbar-form navbar-left\" action=\"/action_page.php\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"search\">\n");
      out.write("        <div class=\"input-group-btn\">\n");
      out.write("          <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("            <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("      <li><a href=\"Loginpage.jsp\"><span class=\"glyphicon glyphicon-user\"></span> login</a></li>\n");
      out.write("      <li><a href=\"RegisterPage.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> register</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</nav>\n");
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
