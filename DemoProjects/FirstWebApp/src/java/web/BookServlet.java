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
import java.sql.*;

/**
 *
 * @author root
 */
public class BookServlet extends HttpServlet {
    
    Connection con;
    Statement stmt;
    ResultSet rs;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    @Override
    public void init()
            throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    
    try {
            String username = "root";
            String password = "ompandey";
            String url = "jdbc:mysql://localhost/test";

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,username,password);
        } catch(Exception e) {
            System.out.println("Sorry failed to connect to the Database. " + e.getMessage());
        }

    
    
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
              try{ 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BookServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from BookMaster");
            
            while(rs.next())
            {
                out.println(("<h2>"+rs.getString("BookName")));  
            }
         
            
            
            String bookname = request.getParameter("txtBookName");
            String authorname = request.getParameter("txtAuthorName");
            String synopsis = request.getParameter("txtSynopsis");
            String publishername = request.getParameter("txtPublisherName");
            
//        out.println("\n"+bookname);
//        out.println(authorname);
//        out.println(synopsis);
//        out.println(publishername);
        
              
              
//              
//           Statement stmt1 = con.createStatement();
//                 String   query = "INSERT INTO BookMaster (BookName, Synopsis, AuthorName," +
//                            " PublisherName) VALUES" +
//                            " ('" + bookname + "','" + synopsis + "','" + authorname + "','"
//                            + publishername + "')";
//                    stmt1.executeUpdate(query);
//
//         
              
          
            
            out.println("<h1>Servlet BookServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
         }
          catch(SQLException e)
          {
        }
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
