<%-- 
    Document   : formating
    Created on : 18 Sep, 2019, 2:19:40 PM
    Author     : root
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>
             <fmt:setLocale value="en"/>
    
            <fmt:setBundle basename="MyValues" var="myval" />
     <fmt:message  key="welcome" bundle="${myval}" /> <br/>  
            
          <fmt:setLocale value="gu_IN"/>
    
            <fmt:setBundle basename="MyValues" var="myval" />
     <fmt:message  key="welcome" bundle="${myval}" /> <br/>  
            <fmt:setLocale value="hi_IN"/>
    
            <fmt:setBundle basename="MyValues" var="myval" />
     <fmt:message  key="welcome" bundle="${myval}" /> <br/>  
            
             <fmt:setLocale value="pa_IN"/>
    
            <fmt:setBundle basename="MyValues" var="myval" />
     <fmt:message  key="welcome" bundle="${myval}" /> <br/>  
          
            
            
            
            
            
            <c:set var="now" value="<%=new java.util.Date()%>"/>
            
            <i>
            <fmt:formatDate type="both" value="${now}"/><br/>
            <fmt:formatDate type="date" value="${now}"/><br/>
             <fmt:formatDate type="time" value="${now}"/><br/>
             <fmt:formatDate dateStyle="short" value="${now}"/><br/>
             <fmt:formatDate dateStyle="long" value="${now}"/><br/>
             <fmt:formatDate dateStyle="medium" value="${now}"/><br/>
             <fmt:formatDate pattern="dd-MM-yyyy - hh: mm :ss" value="${now}"/><br/>
             <fmt:formatDate  timeZone="IST" type="both" value="${now}"/><br/>
           
           
            
            
            </i>
            <br/>
            <c:set var="num" value="152432.12356"/>
            
           1: <fmt:formatNumber maxFractionDigits="3" value="${num}" /> <br/>
           2: <fmt:formatNumber type="currency" currencySymbol="Rupees" value="${num}" /> <br/>
           2: <fmt:formatNumber   groupingUsed="true" value="${num}" /> <br/>
           2: <fmt:formatNumber  maxIntegerDigits="2" value="${num}" /> <br/>
           2: <fmt:formatNumber   pattern="###.###" value="${num}" /> <br/>
            
            
            
            
            
            
            
            
            
        </h3>
    </body>
</html>
