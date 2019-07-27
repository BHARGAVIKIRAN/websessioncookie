/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bhat Sir
 */
@WebServlet(urlPatterns = {"/cookie12"})
public class cookie12 extends HttpServlet {
String username,password;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    username=request.getParameter("user");
   password=request.getParameter("pass");
   if(username.equals("Kiran@sms.com") && password.equals("@sms"))
   {
request.getSession().invalidate();
HttpSession ses = request.getSession();
ses.setMaxInactiveInterval(180);
Cookie co=new Cookie("user",username);
response.addCookie(co);
response.sendRedirect("cookiebe.jsp");
   }
   }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
