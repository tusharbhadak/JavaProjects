<%-- 
    Document   : First
    Created on : 3 Sep, 2019, 1:47:08 PM
    Author     : root
--%>

<%@page contentType="text/html" import="java.util.Date" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Header.jsp"  %>
        <%!

           int x;
           int y;
             
            %>
            <%
                
                x = Integer.parseInt(request.getParameter("x"));
                y = Integer.parseInt(request.getParameter("y"));


                %>
            
            <h2>x = <%=x%> </h2><br/>
            <h2>y = <%=y%> </h2>
        <%-- Addition of two numbers --%>
        
        <%
            
            
             out.println("<h2>The sum of x and y is  "+ (x+y)+"</h2>");
            for(int i =0;i<10;i++)
            out.println(i);
            
               
            
            %>
        
        <br/>
        
        
        <h1> The Current date is : 
           <%=new Date().toString()%>
            <br/>
           </h1>
           
           
           <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
   
     <%@include file="Footer.jsp"  %>
      
    </body>
</html>
