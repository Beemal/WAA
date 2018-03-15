<%-- 
    Document   : guessNumber
    Created on : Mar 6, 2018, 4:09:43 PM
    Author     : bimal.parajuli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guess Number Application</title>
    </head>
    <body>
       <h1>Guess the number between 1-10<h1>
               <form><input type="number" name="number"> <input type="submit" value="Guess" /></form>
               <%HttpSession sess = request.getSession(); 
                  int randomNumber;
                  
                  if(sess.isNew()){
                     randomNumber = (int)(Math.random()*10)+1;
                     sess.setAttribute("randomNumber", randomNumber);
                  }
                  else{
                     randomNumber = (Integer)sess.getAttribute("randomNumber");
                  }
                  if(request.getParameter("number") != null){
                  int number = Integer.valueOf(request.getParameter("number"));
                  if(number > randomNumber){ %>
                    <h1>Too high, Try again !!  </h1>
                   <% }else if(number < randomNumber){ %>
               <h1>Too Low, Try again !! 
                   <%}else { %>
               <h1>Correct, Congratulation !!</h1>
               Continue Playing:
               <% sess.invalidate();}
                } %>
    </body>   
 </html>
