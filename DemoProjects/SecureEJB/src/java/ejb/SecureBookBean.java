/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.BookMaster;
import java.util.List;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJBContext;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@WebService
@Stateless(mappedName = "ejb/securebean")
@DeclareRoles({"admin", "supervisor"})
@RolesAllowed({"admin"})
//@Stateless(mappedName = "ejb/securebean")
public class SecureBookBean implements SecureBookBeanRemote {
@Resource private SessionContext sctx;
@Resource private EJBContext ejbctx;
List<BookMaster> books;
    
     @PersistenceContext(unitName = "SecureEJBPU")
EntityManager em;
   
    @RolesAllowed({"admin"})
    public void addBook(String bookName, String authorName, String publisherName, String synopsis) {
  if (bookName.length() > 0 && synopsis.length() > 0 && authorName.length() > 0
                && publisherName.length() > 0) {
            BookMaster bm = new BookMaster();
            bm.setBookName(bookName);
            bm.setAuthorName(authorName);
            bm.setPublisherName(publisherName);
            bm.setSynopsis(synopsis);
            em.persist(bm);
  }
  }

    @RolesAllowed({"supervisor"})
    public void updateBook(Integer BookID, String bookName, String authorName, String publisherName, String synopsis) {
    BookMaster bm = em.find(BookMaster.class, BookID);
        bm.setBookName(bookName);
        bm.setAuthorName(authorName);
        bm.setPublisherName(publisherName);
        bm.setSynopsis(synopsis);
        em.merge(bm);
    }

    @RolesAllowed({"admin"})
    public void removeBook(Integer BookID) {
  BookMaster bm = em.find(BookMaster.class, BookID);
        em.remove(bm);   }

    @PermitAll
    public List<BookMaster> getAllBooks() {
  System.out.println("Principal " + sctx.getCallerPrincipal());
        System.out.println("Role " + sctx.isCallerInRole("admin"));

        books = em.createNamedQuery("BookMaster.findAll", BookMaster.class).getResultList();
        System.out.println(books.toString());
        return books;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")



}
