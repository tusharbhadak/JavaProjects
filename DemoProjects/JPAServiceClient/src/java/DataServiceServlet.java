/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import client.Employee;
import client.JPAWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author root
 */
@WebServlet(urlPatterns = {"/DataServiceServlet"})
public class DataServiceServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "http://localhost:8080/JPAWebService/JPAWebService?wsdl")
    private JPAWebService_Service service;
    client.JPAWebService jbl;

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
            out.println("<title>Servlet DataServiceServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
                jbl = service.getJPAWebServicePort();
    
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
            
            out.println("<h1>Servlet DataServiceServlet at " + request.getContextPath() + "</h1>");
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

    private void addEmployee(int empno, java.lang.String ename, double sal) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        client.JPAWebService port = service.getJPAWebServicePort();
        port.addEmployee(empno, ename, sal);
    }

}
