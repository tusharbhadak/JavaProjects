<%-- 
    Document   : forwarded
    Created on : 8 Sep, 2019, 10:30:07 PM
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
        <h1>
             <%=request.getParameter("x")%> <%=request.getParameter("y")%>
        </h1>
    </body>
</html>
