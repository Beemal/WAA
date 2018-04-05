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
public class GuestBook extends HttpServlet {

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
            out.println("<title>Servlet GuestBook</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GuestBook at " + request.getContextPath() + "</h1>");
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
        out.println("<form action=guestBook method=get>");
        out.println("Email <input type=text name=email /> Comment<input type=text name=comment /><input type=submit value=Add />");
        out.println("</form>");
        out.println("<h1>Guest Book Details</h1>");
        
        String email = request.getParameter("email");
        String comment = request.getParameter("comment");
     
        if(email != null){
        HttpSession session = request.getSession();
        List<Entry> booklist = (List<Entry>) session.getAttribute("booklist");
        if(booklist == null){
            booklist = new ArrayList<Entry>();
            session.setAttribute("booklist", booklist);
        }
        booklist.add(new Entry(email, comment));
        out.println("<table border=1>");
        out.println("<tr><th>Email Address</th>");
        out.println("<th> Comment </th></tr>");
        for(Entry e : booklist){
            out.println("<tr><td>"+e.getEmail()+"</td>");
            out.println("<td>"+e.getComment()+"</td></tr>");
        }
        }
        out.println("</table>");
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
