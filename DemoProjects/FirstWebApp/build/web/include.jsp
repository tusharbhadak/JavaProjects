<%-- 
    Document   : include
    Created on : 8 Sep, 2019, 10:29:51 PM
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
        
        <jsp:include page="included.jsp">
            <jsp:param name="x" value="I am "/>
            <jsp:param name="y" value="included and coming back to source page!!"/> 
        </jsp:include>
        <br/>
        <h1>Hello World!</h1>
    </body>
</html>
