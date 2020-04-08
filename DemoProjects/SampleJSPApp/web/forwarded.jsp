<%-- 
    Document   : forwarded
    Created on : 9 Sep, 2019, 1:48:09 PM
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
    First Name = <%=request.getParameter("firstname")%><br/>
    Last Name = <%=request.getParameter("lastname")%><br/>
             
    
    
</h1>
    </body>
</html>
