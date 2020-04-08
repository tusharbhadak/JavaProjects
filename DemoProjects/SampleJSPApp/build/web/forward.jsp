<%-- 
    Document   : forward
    Created on : 9 Sep, 2019, 1:47:42 PM
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
            <jsp:param name="firstname" value="Prakash"/>
            <jsp:param name="lastname" value="Patel"/>
            
        </jsp:forward>
        
        
        <h1>Hello World!</h1>
    </body>
</html>
