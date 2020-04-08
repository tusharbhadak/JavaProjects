<%-- 
    Document   : TestJSTL
    Created on : 11 Sep, 2019, 6:03:45 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            int x[] = {1,2,3,4,5};
            java.util.Hashtable h;
            
            %>
            <%
                h = new java.util.Hashtable(); 
                h.put("first", "Hello1");
                  h.put("second", "Hello2"); 
                  h.put("third", "Hello3");
                  java.util.Vector v = new java.util.Vector();
                  v.add("IT");
                  v.add("ICT");
                  v.add("BCA");
                  
                pageContext.setAttribute("vals", x);
                pageContext.setAttribute("hs", h);
                pageContext.setAttribute("vs", v);
                %>
        <h3>
            <c:set var="m" value="12"/>
            <c:out value="The sum of 4 and m is ${4+m}"/>   
            <br>${x}<br/>
            <c:forTokens var="y" delims=":" items="akash:sarah,zenith">
                ${y}<br/>
            </c:forTokens>
                <c:set var="l" value="${param.x}"/>
                <c:if var="s" test="${m > 10}">
                    M is greater than 10 <br/>
                </c:if>
                
                    <c:choose>
                        <c:when test="${l>10}">
                             L is greater than 10 <br/>
                        </c:when>
                        <c:when test="${l<10}">
                             L is less than 10 <br/>
                        </c:when>
                             <c:otherwise>
                                 L is 10<br/>
                             </c:otherwise>                            
                             
                    </c:choose>     
                    
                <c:forEach var="val" items="${vals}">
                    ${val}<br/>
                </c:forEach> 
                      <c:forEach var="str" items="${hs}">
                    ${str.key}<br/>
                </c:forEach> 
             <c:forEach var="course" items="${vs}">
                    ${course}<br/>
                </c:forEach> 
                    <table border="1" >
                        <c:forEach begin="1" end="10" step="1" var="z">
                            <tr>
                                <td>${z}</td><td>${z*z}</td>
                            </tr>
                        </c:forEach>
                        
                    </table>
        </h3>
    </body>
</html>
