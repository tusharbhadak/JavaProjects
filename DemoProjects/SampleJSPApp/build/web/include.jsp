<%-- 
    Document   : include
    Created on : 9 Sep, 2019, 1:47:31 PM
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
            <jsp:param name="firstname" value="Prakash"/>
            <jsp:param name="lastname" value="Patel"/>
            
        </jsp:include>
        
        
        <h1>Hello World!</h1>
    </body>
</html>
