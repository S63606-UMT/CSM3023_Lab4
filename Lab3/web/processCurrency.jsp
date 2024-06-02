<%-- 
    Document   : processCurrency
    Created on : 24 Apr 2024, 4:52:40 pm
    Author     : saifu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example - Currency Converted</title>
    </head>
    <body>

        <%!
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
        %>
        <%
            //Retrieve inputs from currencyConversion.html
            int amount = Integer.parseInt(request.getParameter("amount"));
            String currency = request.getParameter("convertTo");
            
            //Process
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            String currencyName = getChosenCurrency(currency);
            String convertedAmount = numberFormat.format(calculateRate(currency, amount));
            
            
        %>
        <h1>Use JSP Declaration Tag, JSP Scriptlet, and JSP Expression in application</h1>
        <h2><font color="blue">Amount Converted</font></h2>
        <p>Amount converted to <%=currencyName%>: <b><%=convertedAmount%></b></p>
        
    </body>
</html>
