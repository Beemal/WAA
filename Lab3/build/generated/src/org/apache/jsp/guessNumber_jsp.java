package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guessNumber_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Guess Number Application</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h1>Guess the number between 1-10<h1>\n");
      out.write("               <form><input type=\"number\" name=\"number\"> <input type=\"submit\" value=\"Guess\" /></form>\n");
      out.write("               ");
HttpSession sess = request.getSession(); 
                  int randomNumber;
                  
                  if(sess.isNew()){
                     randomNumber = (int)(Math.random()*10)+1;
                     sess.setAttribute("randomNumber", randomNumber);
                  }
                  else{
                     randomNumber = (Integer)sess.getAttribute("randomNumber");
                  }
                  int number = Integer.valueOf(request.getParameter("number"));
//                  if(number > randomNumber){
                
      out.write("\n");
      out.write("              ");
      out.print(randomNumber );
      out.write("\n");
      out.write("                ");
      out.print(number );
      out.write("\n");
      out.write("               \n");
      out.write("               <h1>Too high, Try again !!  between 1-10 </h1>\n");
      out.write("               <h1>Too Low, Try again !!  between 1-10\n");
      out.write("               <h1>Correct, Congratulation !!</h1>\n");
      out.write("    </body>   \n");
      out.write(" </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
