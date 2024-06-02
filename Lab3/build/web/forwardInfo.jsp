<%-- 
    Document   : forwardInfo
    Created on : 2 Jun 2024, 3:45:27 pm
    Author     : Saiful
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>&lt;Forwarded_Action Example in JSP&gt;</title>
    </head>
    <body>
       
        <%String name = request.getParameter("U_name");%>
        <%String email = request.getParameter("Email");%>
        <%String nationality = request.getParameter("Nationality");%>
        <%String background = request.getParameter("Background");%>
        
        <% if (name != null) {%>
            <b><br><br><h2 align="center">
                <%=name%><br>
                <%=email%><br>
                <%=nationality%><br>
                <%=background%><br><br>
                
                <%out.print("Today is: " + java.util.Calendar.getInstance().getTime());%>
            </h2></b></br>
        <%}%>
            
        
    </body>
</html>
