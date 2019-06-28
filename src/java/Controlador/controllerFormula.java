/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import HibernateUtil.HibernateUtil;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import Modelo.Formula;
import Modelo.Cita;


/**
 *
 * @author Aprendiz
 */
public class controllerFormula extends HttpServlet {

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
        String action = request.getParameter("a");
        switch (action){
            case "create":
                create(request, response);
            break;
            case "update":
                update(request, response);
            break;
            case "delete":
                delete(request, response);
            break;
            case "admin":
                admin(request, response);
            break;
       
        }
    }
    
    private void create(HttpServletRequest request, HttpServletResponse response){
    if(request.getMethod().equalsIgnoreCase("POST")){
        
        String descripcion= request.getParameter("descripcion");
        
        Formula fla = new Formula();
        
        
        
       
    }
}  
   private void update(HttpServletRequest request, HttpServletResponse response){
   Session sesion = HibernateUtil.getSessionFactory().openSession();
    
  
}    
   
   private void delete(HttpServletRequest request, HttpServletResponse response){
    Session sesion = HibernateUtil.getSessionFactory().openSession();
   
}  
    private void admin(HttpServletRequest request, HttpServletResponse response){
         Session sesion= HibernateUtil.getSessionFactory().openSession();
       
    
        
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
