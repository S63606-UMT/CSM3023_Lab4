package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;

public final class processCurrency_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            //According to Wise.com as of 2/6/2024
            final double USD = 4.71;
            final double STG = 6.00;
            final double EURO = 5.11;
            
            private double calculateRate(String currency, int amount) {
                
                double currencyChange = 0.00f;

                if (currency.equals("1"))
                    currencyChange = (double) (amount / USD);
                if (currency.equals("2"))
                    currencyChange = (double) (amount / STG);
                if (currency.equals("3"))
                    currencyChange = (double) (amount / EURO);

                return currencyChange;
            }            
            
            private String getChosenCurrency(String currency) {
                if (currency.equals("1"))
                    return "United State Dollars";
                if (currency.equals("2"))
                    return "Pound Sterling";
                if (currency.equals("3"))
                    return "Euro";
                else
                    return "None";
            }
        
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Example - Currency Converted</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            //Retrieve inputs from currencyConversion.html
            int amount = Integer.parseInt(request.getParameter("amount"));
            String currency = request.getParameter("convertTo");
            
            //Process
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            String currencyName = getChosenCurrency(currency);
            String convertedAmount = numberFormat.format(calculateRate(currency, amount));
            
            
        
      out.write("\n");
      out.write("        <h1>Use JSP Declaration Tag, JSP Scriptlet, and JSP Expression in application</h1>\n");
      out.write("        <h2><font color=\"blue\">Amount Converted</font></h2>\n");
      out.write("        <p>Amount converted to ");
      out.print(currencyName);
      out.write(": <b>");
      out.print(convertedAmount);
      out.write("</b></p>\n");
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
