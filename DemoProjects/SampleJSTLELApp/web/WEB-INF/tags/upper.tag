<%-- 
    Document   : upper
    Created on : 19 Sep, 2019, 1:33:25 PM
    Author     : root
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>
<jsp:doBody var="content"/>
<%-- any content can be specified here e.g.: --%>
<h2>
    <%
        String str = (String)jspContext.getAttribute("content");

        out.println(str.toUpperCase());

        %>
    
    
    
</h2>