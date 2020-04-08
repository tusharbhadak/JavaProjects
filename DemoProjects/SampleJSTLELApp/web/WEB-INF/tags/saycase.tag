<%-- 
    Document   : saycase
    Created on : 19 Sep, 2019, 1:39:00 PM
    Author     : root
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="typecase"%>
<jsp:doBody var="content"/>
<%-- any content can be specified here e.g.: --%>
<h2>
    <%
        String mycase = (String) jspContext.getAttribute("typecase");
         String content = (String) jspContext.getAttribute("content");
       
         if(mycase.equals("upper"))
         out.println(content.toUpperCase());
         else if(mycase.equals("lower"))
          out.println(content.toLowerCase());
         else
          out.println("Error in specifying case");


        %>
    
    
    
</h2>