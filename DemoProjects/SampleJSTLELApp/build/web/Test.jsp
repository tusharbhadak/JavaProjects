<%-- 
    Document   : Test
    Created on : 11 Sep, 2019, 2:59:30 PM
    Author     : root
--%>

<%@page contentType="text/html" import="java.util.Hashtable"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!
           int num[] = {10,20,30,40,50,60}; 
           Hashtable h;

            %>
            <%
                h = new Hashtable();
                h.put("1", "Gujarat");
                h.put("2", "Maharashtra");
                h.put("3", "Rajasthan");
                pageContext.setAttribute("arr", num);
                session.setAttribute("states", h);
                %>
                
        <h3>
            <c:set var="x" value="55"/>
            <c:out value="The sum of 40 and ${x} is ${40+x}"/><br/>
            
            <c:if test="${x>50}">
                X is more than 50
            </c:if>
                 <c:if test="${x<50}">
                X is less than 50
            </c:if>
             <c:if test="${x==50}">
                X is equal to 50
            </c:if>
            <br/>
            
            <c:choose>
                <c:when test="${x>50}">
                    X is greater than 50
                </c:when>
                <c:when test="${x<50}">
                    X is less than 50
                </c:when>
                <c:otherwise>
                    X is 50
                </c:otherwise>
            </c:choose>
            <br/>
            
            
            <c:forTokens var="country" delims="," items="India,UK,USA,Spain">
                ${country}<br/>
            </c:forTokens>
            
            
            <table border="1">
                <tr><th>Num</th><th>sqr of Num</th></tr>
                
                <c:forEach begin="1" end="10" step="1" var="y">
                    <tr><td>${y}</td><td>${y*y}</td></tr>
                </c:forEach>   
                
                    <c:forEach var="mynum" items="${arr}">
                        ${mynum} <br/>
                    </c:forEach>
                        <br/>
                        
                      <c:forEach var="state" items="${states}">
                        ${state.key} &nbsp;&nbsp; ${state.value} <br/>
                    </c:forEach>
                
                        
                        
            </table> 
            
            
</h3>
    </body>
</html>
