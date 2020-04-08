/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.JPABeanLocal;
import entity.Employee;
import java.io.IOException;
import java.io.PrintWriter;
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
public class JPAServlet extends HttpServlet {
    
    @EJB JPABeanLocal jbl;

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
            out.println("<title>Servlet JPAServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           //jbl.addEmployee(18, "Sunil Shah", 4400.00);
        //  jbl.updateEmployee(17, "Alkesh Patel", 7000);
         
        //jbl.removeEmployee(18);
        Collection<Employee> employees = jbl.getAllEmployees();
            
        
            out.println("<hr/><h3>");
            for(Employee e : employees)
            {
                
                out.println("<br/>"+e.getEmpno()+"   "+ e.getEname()+ "    "+ e.getSalary());
                
            }
             out.println("</h3>");
            
            
             Collection<Employee> emps = jbl.getEmployeesOnSal(5000);
            
        
            out.println("<hr/><br/><br/><h3>");
            for(Employee e : emps)
            {
                
                out.println("<br/>"+e.getEmpno()+"   "+ e.getEname()+ "    "+ e.getSalary());
                
            }
             out.println("</h3>");
            
            
             
            out.println("<h1>Servlet JPAServlet at " + request.getContextPath() + "</h1>");
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
