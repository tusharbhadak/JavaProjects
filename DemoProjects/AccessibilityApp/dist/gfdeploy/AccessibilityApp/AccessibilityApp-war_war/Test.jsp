<%-- 
    Document   : Test
    Created on : 30 Sep, 2019, 12:54:42 PM
    Author     : root
--%>

<%@page contentType="text/html" import="ejb.StringBeanLocal, javax.naming.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!
           StringBeanLocal sl=null;
            
           public void jspInit()
                {

                    try{
InitialContext ic = new InitialContext();
                            sl = (StringBeanLocal) ic.lookup("java:global/AccessibilityApp/AccessibilityApp-ejb/StringBean!ejb.StringBeanLocal");

                    
                        }
catch(Exception e)
{

}

                }
            %>
        
        <h1><%
               out.println(sl.joinStr("Welcome", " To India"));
            %></h1>
    </body>
</html>
