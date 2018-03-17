<%-- 
    Document   : testJSP
    Created on : Mar 15, 2018, 1:13:19 PM
    Author     : bimal.parajuli
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

        <title>JSP Page for Testing</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="smartLink" value="<div style='color:red' class='row'>Bimal Parajuli</div>" />
         <c:set var="smartLinkLabel" value="${fn:substringAfter(smartLink,'>')} (opens a new Window)" />
         ${smartLinkLabel} <br />
       
    </body>
</html>
