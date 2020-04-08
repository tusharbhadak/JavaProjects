<%-- 
    Document   : Data
    Created on : 17 Sep, 2019, 1:50:22 PM
    Author     : root
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <sql:setDataSource  dataSource="jdbc/ictdb"/>      
            
          
                    <sql:update var="insert"> 
                        insert into employee values (?,?,?)
                        <sql:param value="16"/>
                        <sql:param value="Swati"/>
                        <sql:param value="5000"/>                 
                      </sql:update>
           
                        <sql:query var="query">
                select * from employee
            </sql:query>
            
            
                <c:forEach var="row" items="${query.rowsByIndex}">
                    
                    ${row[0]} &nbsp;&nbsp;&nbsp; ${row[1]} &nbsp;&nbsp;&nbsp; ${row[2]} <br/>
                </c:forEach>
            
                        
        </h1>
    </body>
</html>
