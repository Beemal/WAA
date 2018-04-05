/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bimal.parajuli
 */
@WebServlet(name = "AddNameServlet", urlPatterns = {"/addName"})
public class AddNameServlet extends HttpServlet {

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
            out.println("<title>Servlet AddNameServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddNameServlet at " + request.getContextPath() + "</h1>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Collection<Person> personlist = new ArrayList<>();
        
        String key= request.getParameter("key");
        String firstname= request.getParameter("firstname");
        String lastname= request.getParameter("lastname");
        
        if(key != null && firstname != null && lastname !=null){
            HttpSession session = request.getSession();
            personlist = (Collection<Person>)session.getAttribute("list");
            if(personlist == null){
                personlist = new ArrayList<>();
                session.setAttribute("list", personlist);
            }
            personlist.add(new Person(key, firstname, lastname));
        }
        
        out.println("<html>");
        out.println("<body>");
        out.println("<table border='1'>");
        for(Person p: personlist){
            out.println("<tr><th>"+p.getKey()+"</th><th>"+p.getFirstname()+"</th><th>"+p.getLastname()+"</th></tr>");
        }
        out.println("</table>");
        out.println("<br>");
        out.println("<form method=GET action=addName>");
        out.println("Key=<input type=text name=key>");
        out.println("First Name=<input type=text name=firstname>");
        out.println("Last Name=<input type=text name=lastname>");
        out.println("<input type=submit value='Add'>");
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
