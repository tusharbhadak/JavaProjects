<%-- 
    Document   : forward
    Created on : 8 Sep, 2019, 10:29:34 PM
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
        
         <jsp:forward page="forwarded.jsp">
            <jsp:param name="x" value="I am "/>
            <jsp:param name="y" value="forwarded and I do not contain any thing from source page !!"/> 
        </jsp:forward>
        <h1>Hello World!</h1>
    </body>
</html>
