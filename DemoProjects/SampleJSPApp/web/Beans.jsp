<%-- 
    Document   : Beans
    Created on : 9 Sep, 2019, 2:26:11 PM
    Author     : root
--%>


<jsp:useBean id="book" class="logic.BookMaster" scope="request">
    <jsp:setProperty name="book" property="*"/>
</jsp:useBean>

    
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>

          Book Name =   <%=book.getBookName()%> <br/>
           Author Name =   <%=book.getAuthorName()%> <br/> 
           Publisher Name =   <%=book.getPublisherName()%> <br/>  
           Synopsis =   <%=book.getSynopsis()%> <br/> 
           <hr/>
           <i>
           Book Name =   <jsp:getProperty name="book" property="bookName"/> <br/>
           Author Name =  <jsp:getProperty name="book" property="authorName"/> <br/> 
           Publisher Name =<jsp:getProperty name="book" property="publisherName"/><br/>  
           Synopsis =   <jsp:getProperty name="book" property="synopsis"/> <br/> 
           </i>
        
        </h2>
    </body>
</html>
