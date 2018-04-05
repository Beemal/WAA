<%-- 
    Document   : stackjsp
    Created on : Mar 30, 2018, 12:36:05 PM
    Author     : bimal.parajuli
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>stack</title>
    </head>
    <body>
        <table border="1">
            <c:forEach var="data" items="${stack.elements}">
                <tr>
                    <td>
                    <c:out value="${data}" />
                </td>
            </tr>
            </c:forEach>
        </table>
        
        <form action="stackServlet" method="get">
        <input type="text" name="val" /><input type="submit" value="Push" name="action" /><br />
        <input type="submit" value="Pop" name="action"/>
        </form>
    </body>
</html>
