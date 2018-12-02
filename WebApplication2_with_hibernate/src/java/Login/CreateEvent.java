/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.EventInsert;

/**
 *
 * @author Parmjot Singh chahal
 */
public class CreateEvent extends HttpServlet {

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
            HttpSession session=request.getSession(false);
            if((String)session.getAttribute("Email")==null){
                response.sendRedirect("LoginJsp.jsp");
            }
            String event_name=request.getParameter("event name")+" ";
            String description=request.getParameter("description");
            String place=request.getParameter("place");
            String district=request.getParameter("district");
            String state=request.getParameter("state");
            String start_date=request.getParameter("start date");
            String end_date=request.getParameter("end date");
            
            String[] arr=event_name.split(" ");
            String databaseTableName=(String)session.getAttribute("Email")+arr[0];  
            System.out.println("<h1>"+databaseTableName+"</h1>");
            
            EventInsert obj=new EventInsert();
            boolean f=obj.insert((String)session.getAttribute("Name"),(String)session.getAttribute("Email"), event_name, description, place, district, state, start_date, end_date, databaseTableName);
            System.out.print(f);
            if(f)
                response.sendRedirect("search.jsp");
            else
                response.sendRedirect("create.jsp");
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
