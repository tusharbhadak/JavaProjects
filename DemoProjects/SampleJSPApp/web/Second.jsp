<%-- 
    Document   : Second
    Created on : 9 Sep, 2019, 1:38:27 PM
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
            Book Name = <%=session.getAttribute("bookname")%>
            Company Name = <%=application.getAttribute("company")%>
                    
            
            
        </h1>
    </body>
</html>
