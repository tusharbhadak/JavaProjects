/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author root
 */
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    
        System.out.println("Hello Servlet Initialized .....");
    }
    
    

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
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            HttpSession session = request.getSession();
            
            String game = (String) session.getAttribute("game");
            int points = (Integer)session.getAttribute("score");
            String city = (String) session.getAttribute("place");
            int sessionnum = (Integer)session.getAttribute("sessionnum");
             int appnum= (Integer)getServletContext().getAttribute("applicationnum");
             
            
//            String firstName= request.getParameter("fname");
//            String lastName = request.getParameter("lname");
//              
//            String ingredients[] = request.getParameterValues("ingredients[]");
//            
//            out.println("<h2> "+ firstName + "  "+ lastName +"</h2>");
//            out.println("<h2>You Ordered ...</h2>");
//            
//            if(lastName.equals("Shah"))
//                response.sendRedirect("AnotherServlet");
//            
//            for(String in : ingredients)
//            {
//                out.println("<h2><i> "+ in+ "</i></h2>");
//            }
//                 out.println("<h2> Game ="+game+"</h2>\n");
            out.println("<h2> Session Num ="+(sessionnum+1)+"</h2>\n");
               out.println("<h2> Application Num ="+(appnum+1)+"</h2>\n");
         
            session.setAttribute("sessionnum", sessionnum+1);
            getServletContext().setAttribute("applicationnum",appnum+1);
             
          
            out.println("<h2> Game ="+game+"</h2>\n");
             out.println("<h2> Score ="+points+"</h2>\n");
              out.println("<h2> Place ="+city+"</h2>\n");
              
              out.println("<h2> Address ="+getServletContext().getAttribute("Address")+"</h2>");
              
              
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

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
   
          
        System.out.println("Hello Servlet Destroyed .....");
 
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
