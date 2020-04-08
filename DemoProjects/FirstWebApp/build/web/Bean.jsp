<%-- 
    Document   : Bean
    Created on : 8 Sep, 2019, 10:43:12 PM
    Author     : root
--%>
<jsp:useBean class= "book.BookMaster"  id="book" scope="request">
    <jsp:setProperty name="book"  property="*"/>
</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=book.getTxtBookName() %> <br/>
            <%=book.getTxtAuthorName() %><br/>
             <%=book.getTxtPublisherName() %>
             <%=book.getTxtSynopsis() %>
        </h1>
        
    </body>
</html>
