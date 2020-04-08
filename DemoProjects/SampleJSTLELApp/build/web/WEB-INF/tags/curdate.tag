<%-- 
    Document   : curdate
    Created on : 19 Sep, 2019, 1:26:00 PM
    Author     : root
--%>

<%@tag description="put the tag description here"  pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%-- any content can be specified here e.g.: --%>
<h2> 
    <%
        out.println("The current date is " + new java.util.Date().toString());
        %>
</h2>