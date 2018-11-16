/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floweพ4uServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
import model.Customer;
import model.jpa.controller.CustomerJpaController;













/**
 *
 * @author Student
 */
public class LoginServlet extends HttpServlet {

     @PersistenceUnit(unitName = "ProjectFlower4UPU")
    EntityManagerFactory emf;
     
    @Resource
    UserTransaction utx;
  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if (email != null && email.length() > 0 && password != null && password.length() > 0) {
            CustomerJpaController accountJpactrl = new CustomerJpaController(utx, emf);
            Customer c = accountJpactrl.findCustomer(email);
            if (c != null) {
                if (password.equals(c.getPassword())) {
                    request.getSession().setAttribute("user", c);
                    getServletContext().getRequestDispatcher("/ProductList.html").forward(request, response);
                }
            }
            request.setAttribute("massage", "Invalid  email or password !!!");
        }
        getServletContext().getRequestDispatcher("/Loginpage.jsp").forward(request, response);
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
