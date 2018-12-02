/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.LoginCheck;
import modal.User;

/**
 *
 * @author Parmjot Singh chahal
 */
public class Login extends HttpServlet {

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
                
                    PrintWriter out=response.getWriter();
                    String email=request.getParameter("email");
                    String pass=request.getParameter("pass");
                    
                    LoginCheck lc=new LoginCheck();
                    User u = new User(email, pass);
                    String name=lc.loginValidate(u);
                    System.out.println("email : " + email +" password : " + pass);
                    System.out.println("email : " + u.getEmail() +" password : " + u.getPassword());
                    HttpSession session=request.getSession();  
                    session.setAttribute("Name",name);
                    session.setAttribute("Email",email);
                    System.out.println(name);
                    if(name!=null){  
                        response.sendRedirect("Home.jsp");
                    }
                    else{
                        response.sendRedirect("LoginJsp.jsp");
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
        
       // PrintWriter out = response.getWriter();
//        String email=request.getParameter("email");
//        String pass=request.getParameter("pass");
//        if(email.equals("abc@gmail.com")){
//            out.println("abc");
//        }
//        else{
//            out.println("==");
//        }
        processRequest(request, response);
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
