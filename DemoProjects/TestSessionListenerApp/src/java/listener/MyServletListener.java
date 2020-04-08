/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author root
 */
public class MyServletListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized - Application is deployed");
    
        sce.getServletContext().setAttribute("company", "Reliance Info");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
               System.out.println("Context Destroyed - Application is undeployed");
 
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        
        System.out.println("Attribute added with name = "+ event.getName() + " and value = "+ event.getValue());
        
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
         System.out.println("Attribute with name "+ event.getName()+ "  is removed");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
   
    
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
    }
}
