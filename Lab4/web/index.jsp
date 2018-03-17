<%-- 
    Document   : index
    Created on : Mar 17, 2018, 6:05:16 PM
    Author     : bimal.parajuli
--%>

<%@page import="com.learning.servlet.mvc.Model.People"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Names with MVC - Lab4</title>
    </head>
    <body>
         <a href="allNameServlet"><button>Show all Names</button></a>
         <div>
             <% List<People> list = (List<People>)session.getAttribute("list");
              if(list == null || list.size() == 0){%>
                <h4>No people added in this Session</h4>
              <%}else{ %>
               <h4>List of People in this Session</h4>
              <ul> 
                <% for(People people: list){ %>
                  <li><%= people %></li>
                <% } %>
              </ul>
               <%}%>
         </div>
        <form action="addNameServlet" method="get">
        Key=<input type="text" name="key" /> First Name= <input type="text" name="fname" /> Last Name=<input type="text" name="lname"/> 
        <input type="submit" value="Add" />
        </form>
        <form action="removeNameServlet" method="get">
        Key=<input type="text" name="key" /> <input type="submit" value="Remove" />
        </form>
         <br />
        <em>${message}</em>
    </body>
</html>
