<%-- 
    Document   : Book
    Created on : 9 Sep, 2019, 1:18:07 PM
    Author     : root
--%>

<%@page contentType="text/html" import="java.sql.*,java.io.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!
            Connection con;
            Statement stmt;
            ResultSet rs;

            %>
        
        <h1>
            <%
//                try{
//                Class.forName("com.mysql.jdbc.Driver");
//                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","user","password");
//                
//                
//                }
//                catch(Exception e)
//                {
//                    
//                }

                    session.setAttribute("bookname", request.getParameter("txtBookName"));
                
                    application.setAttribute("company", "xyz");
            %>
            
            Book Name    <%=request.getParameter("txtBookName")%><br/>
            Author Name     <%=request.getParameter("txtAuthorName")%><br>
            Publisher Name  <%=request.getParameter("txtPublisherName")%><br/>
            Synopsis     <%=request.getParameter("txtSynopsis")%>
                  
            
            
        </h1>
    </body>
</html>
