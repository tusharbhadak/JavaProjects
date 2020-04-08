/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import client.BookRestClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response; 
import rest.BookMaster;

/**
 *
 * @author root
 */
public class RestServlet extends HttpServlet {
    
    Response res;
    BookRestClient client;
    Collection<BookMaster> books;
    GenericType<Collection<BookMaster>> gbooks;
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
            out.println("<title>Servlet RestServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            books = new ArrayList<BookMaster>();
            gbooks = new GenericType<Collection<BookMaster>>() {};
           
            client = new BookRestClient();
    BookMaster b = client.find_XML(BookMaster.class, "334");
//             BookMaster b = new BookMaster();
          //  b.setAuthorName("Suhail Seth");
            // b.setBookName("Flights");
            //b.setPublisherName("Sai Ram");
            //b.setSynopsis("Business book");
//            
         //   client.create_JSON(b);
        // client.edit_JSON(b, "334");
        client.remove("334");
         res= client.findAll_XML(Response.class);
             books = res.readEntity(gbooks);
            for(BookMaster bk : books)
            {
            out.println("<h1>" + bk.getBookName()+ "</h1>");
            }
       
            out.println("<h1>Servlet RestServlet at " + request.getContextPath() + "</h1>");
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
