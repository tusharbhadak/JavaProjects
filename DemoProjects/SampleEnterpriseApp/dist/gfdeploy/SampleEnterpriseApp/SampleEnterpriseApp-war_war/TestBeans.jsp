<%-- 
    Document   : TestBeans
    Created on : 30 Sep, 2019, 2:05:48 PM
    Author     : root
--%>

<%@page contentType="text/html" import="ejb.*,javax.naming.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            StringOpBeanRemote sbr = null;
            SomeMoreOpBeanLocal sbl = null;

            public void jspInit() {
            try{

            InitialContext ic = new InitialContext();
            sbr = (StringOpBeanRemote)ic.lookup("ejb/ictstring");
            sbl = (SomeMoreOpBeanLocal) ic.lookup("java:global/SampleEnterpriseApp/SampleEnterpriseApp-ejb/SomeMoreOpBean!ejb.SomeMoreOpBeanLocal");



                }
               catch(Exception e)
            {

            }
            }

        %>




        <h1>
     Upper Case :        <%= sbr.changeToUpper("abcdef")%> <br/>
     Lower Case :        <%= sbr.changeToLower("ABCDEFG")%> <br/>
     Concatenate  :        <%=sbl.concatenate("Hello", "ICT")%> <br/>
     Extract  :        <%=sbl.extractStr("Welcome", 3)%> <br/>
                    
            
            
        </h1>
    </body>
</html>
