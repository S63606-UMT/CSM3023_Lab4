package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forwardInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>&lt;Forwarded_Action Example in JSP&gt;</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");
String name = request.getParameter("U-Name");
      out.write("\n");
      out.write("        ");
String email = request.getParameter("Email");
      out.write("\n");
      out.write("        ");
String nationality = request.getParameter("Nationality");
      out.write("\n");
      out.write("        ");
String background = request.getParameter("Background");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 if (name != null) {
      out.write("\n");
      out.write("            <h1>Habibi</h1>\n");
      out.write("            <b><br><br><h2 align=\"center\">\n");
      out.write("                ");
      out.print(name);
      out.write("<br>\n");
      out.write("                ");
      out.print(email);
      out.write("<br>\n");
      out.write("                ");
      out.print(nationality);
      out.write("<br>\n");
      out.write("                ");
      out.print(background);
      out.write("<br><br>\n");
      out.write("                \n");
      out.write("                ");
out.print("Today is: " + java.util.Calendar.getInstance().getTime());
      out.write("\n");
      out.write("            </h2></b></br>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
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
