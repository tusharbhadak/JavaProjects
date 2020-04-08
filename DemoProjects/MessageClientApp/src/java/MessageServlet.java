/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.jms.Connection;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class MessageServlet extends HttpServlet {

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
            out.println("<title>Servlet MessageServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            try{
            Properties p = new Properties();
            
            p.put(Context.PROVIDER_URL, "mq://localhost:7676");
            InitialContext ic = new InitialContext(p);
            Queue queue = (Queue)ic.lookup("jms/ictqueue");
            QueueConnectionFactory qf = (QueueConnectionFactory)ic.lookup("jms/ictqueueFactory");
            Connection qcon = (Connection) qf.createConnection();
            Session qsession = (Session) qcon.createSession();
            MessageProducer mp = (MessageProducer) qsession.createProducer(queue);
            TextMessage tm = qsession.createTextMessage("Hello Queue Bean !!!");
            mp.send(tm);
            
            qcon.close();
         
            // Sending Message to Topic Box
             Properties p1 = new Properties();
            
            p1.put(Context.PROVIDER_URL, "mq://localhost:7676");
            InitialContext ic1 = new InitialContext(p1);
            Topic topic =(Topic) ic1.lookup("jms/icttopic");
            TopicConnectionFactory tf = (TopicConnectionFactory) ic1.lookup("jms/icttopicFactory");
            TopicConnection tcon = (TopicConnection) tf.createTopicConnection();
            TopicSession tsession = (TopicSession) tcon.createTopicSession(true, 0);
            TopicPublisher mpr = (TopicPublisher) tsession.createPublisher(topic);
            TextMessage tms = (TextMessage) tsession.createTextMessage("Hello Topic Bean !!!");
            mpr.publish(tms);
            
            tcon.close();
            
            }
            catch(Exception e)
            {
                
            }
            
            out.println("<h1>Servlet MessageServlet at " + request.getContextPath() + "</h1>");
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
