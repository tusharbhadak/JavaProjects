<%-- 
    Document   : CustomTags
    Created on : 19 Sep, 2019, 1:29:23 PM
    Author     : root
--%>
<%@taglib  uri="/WEB-INF/tlds/ict.tld" prefix="ict" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            
            <ict:curdate/> <br/>
            <ict:upper> honesty is THE best Policy </ict:upper><br/>
            <ict:saycase typecase="asasa"> hello how are you</ict:saycase>
            <br/>
            The reverse of HELLO is ${ict:reverseString("hello")}
            
            ${fn:toUpperCase("msc(ict)")}
            
        </h1>
    </body>
</html>
