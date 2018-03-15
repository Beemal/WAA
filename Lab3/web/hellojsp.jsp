<%-- 
    Document   : hellojsp
    Created on : Mar 6, 2018, 4:01:29 PM
    Author     : bimal.parajuli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World JSP</title>
    </head>
    <body>
        <h1>Hello World</h1>
        <%int i=1; while(i<11){%>
        <h2><%=i %></h2>
        <% i++; %> 
        <%} %>
    </body>
</html>
