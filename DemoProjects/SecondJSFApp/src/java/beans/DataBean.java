/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.BookMaster;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Named(value = "dataBean")
@RequestScoped
public class DataBean {
    @PersistenceContext(unitName = "jsfpu")
    EntityManager em;

    BookMaster book;
    Collection<BookMaster> books;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public BookMaster getBook() {
        return book;
    }

    public void setBook(BookMaster book) {
        this.book = book;
    }

    public Collection<BookMaster> getBooks() {
       
        try{
       books = em.createNamedQuery("BookMaster.findAll").getResultList();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       for(BookMaster b : books)
        {
            System.out.println(b.getBookName());
        }
        
        return books;
    }

    public void setBooks(Collection<BookMaster> books) {
        this.books = books;
    }
    
    /**
     * Creates a new instance of DataBean
     */
    public DataBean() {
       // books = new ArrayList<BookMaster>();
      
       
    
    }
    
}
