<%-- 
    Document   : Parse
    Created on : 17 Sep, 2019, 2:13:33 PM
    Author     : root
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>
            <c:import var="document" url="/book.xml"/>
            
            <x:parse var="doc"  doc="${document}"/> 
            
            <x:out  select="$doc//details/publishername"/>
            
            <x:forEach select="$doc//details">
           Book Name :     <x:out select="bookname"/><br/>
           Author Name :     <x:out select="authorname"/><br/>
           Publisher Name :     <x:out select="publishername"/><br/>
           Synopsis :     <x:out select="synopsis"/>
           <br/><br/><br/>
            </x:forEach>
            <br/>
           <x:out  select="$doc//@x"/>
            
            
        </h3>
    </body>
</html>
