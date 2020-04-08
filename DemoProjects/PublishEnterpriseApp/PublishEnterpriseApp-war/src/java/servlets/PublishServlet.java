/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ejb.PublishBeanLocal;
import entity.Address;
import entity.Customer;
import entity.Subscription;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class PublishServlet extends HttpServlet {
    
    @EJB PublishBeanLocal pbl;

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
            out.println("<title>Servlet PublishServlet</title>");            
            out.println("</head>");
            out.println("<body><h3>");
            
           // pbl.addCustomer("Sumit", "Sehgal");
          //  pbl.addAddressToCustomer("Shastri Street", "Surat", "Gujarat", "380012", 60);
           ArrayList<Integer> list = new ArrayList<Integer>();
           list.add(6);list.add(7);list.add(8);list.add(9);
           
           pbl.addSubscriptionsToCustomer(60, list);
          
          Collection<Customer> customers = pbl.getAllCustomers();
            
            for(Customer c : customers)
            {
               out.println("Id = "+ c.getCustomerID()+ "   Name = "+ c.getFirstName()+"  "+ c.getLastName()  );
              
               Collection<Address> addresses = pbl.getAllAddressesOfCustomer(c.getCustomerID());
              
               for(Address a : addresses )
               {
               out.println("<br/>Address id = "+ a.getAddressId()+ "   City = "+ a.getCity()+"  State  "+ a.getState() );
                   
               }
               
               Collection<Subscription> subs = pbl.getAllSubscriptionsOfCustomer(c.getCustomerID());
              for(Subscription s : subs)
              {
               out.println("<br/>Sub id = "+ s.getSubscriptionId()+ "   Title = "+ s.getTitle()+"  Type  "+ s.getType() );
                  
              }
               
               out.println("<hr/>");
               
            }
            
            
            
            
            
            
            
            
            out.println("Servlet PublishServlet at " + request.getContextPath() + " ");
            out.println("<h3></body>");
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
