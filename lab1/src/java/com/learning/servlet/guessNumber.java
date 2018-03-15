/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bimal.parajuli
 */
public class guessNumber extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet guessNumber</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet guessNumber at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int randomNumber;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        randomNumber = (int)((Math.random()*10)+1);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Guess the number between 1-10<h1>");
        out.println("<form method=POST action=guessNumber>");
        out.println("<input type=text name=number>");
        out.println("<input type=text name=randomNumber value="+randomNumber+" hidden>");
        out.println("<input type=submit value='Guess'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
       
        out.close();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         int number = Integer.parseInt(request.getParameter("randomNumber"));
 
         if(Integer.parseInt(request.getParameter("number")) > number){
             out.println("<h1>Too high, Try again !!  between 1-10");
            out.println("<form method=POST action=guessNumber>");
            out.println("<input type=text name=number>");
            out.println("<input type=text name=randomNumber value="+randomNumber+" hidden>");
            out.println("<input type=submit value='Guess'>");
            out.println("</form>");
         }else if(Integer.parseInt(request.getParameter("number")) < number){
             out.println("<h1>Too Low, Try again !!  between 1-10");
             
            out.println("<form method=POST action=guessNumber>");
            out.println("<input type=text name=number>");
            out.println("<input type=text name=randomNumber value="+randomNumber+" hidden>");
            out.println("<input type=submit value='Guess'>");
            out.println("</form>");
         }else{
              out.println("<h1>Correct, Congratulation !!<br>");
              out.println("<a href=guessNumber> Play Again </a>");
         }
         out.close();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
