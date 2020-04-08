<%-- 
    Document   : Access.jsp
    Created on : 13 Sep, 2019, 1:58:29 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            request.setAttribute("first", "Priya");
             pageContext.setAttribute("first", "Rohit");
            session.setAttribute("first", "Akash");
            application.setAttribute("first", "Ahmed");
            
            
            


            %>>
            <h2> 
            ${requestScope.first} <br/>
            ${pageScope.first} <br/>
           ${sessionScope.first} <br/>
            ${applicationScope.first} <br/>
            
            
            </h2>
    </body>
</html>
