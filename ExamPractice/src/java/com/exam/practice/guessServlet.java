/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bimal.parajuli
 */
public class guessServlet extends HttpServlet {

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
            out.println("<title>Servlet guessServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet guessServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
private int number;
public void init(){
    number = 8;
    
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        if(request.getParameter("guessNum") != null){
            HttpSession session = request.getSession();
            Integer count = (Integer)session.getAttribute("count");
            if(count == null){
                count = new Integer(0);
                session.setAttribute("count", count);
            }
            List<Integer> history = (List<Integer>)session.getAttribute("history");
            if(history == null){
                history = new ArrayList<>();
                session.setAttribute("history", history);
            }
            int guessNum = Integer.parseInt(request.getParameter("guessNum"));
            if(guessNum > number){
                out.println("Your Guess is Too high, try again");
                count++;
                session.setAttribute("count", count);
                System.out.println("Less than -- "+count);
                out.println("<br />Number of Guesses = "+count);
                history.add(guessNum);
                out.println("<br />History of guesses ="+history.toString());
                
            }else if(guessNum < number){
                out.println("Your Guess is Too Low, try again"); 
                count = count+1;
                session.setAttribute("count", count);
                System.out.println("greater than -- "+count);
                out.println("<br />Number of Guess = "+count);
                history.add(guessNum);
                out.println("<br />History of guesses ="+history.toString());
                
            }else{
                out.println("Congrats! You guessed the number correct<br />");
                count = 0;
                session.setAttribute("count", count);
                System.out.println("equal to -- "+count);
                history.clear();
            }
        }
        out.println("<form action=guessServlet method=GET >");
        out.println("Type Your Guess=<input type=text name=guessNum /><br />");
        out.println("<input type=submit value='Submit' />");
        out.println("</form>");
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
        processRequest(request, response);
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
