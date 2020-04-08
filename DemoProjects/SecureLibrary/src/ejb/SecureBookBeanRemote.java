/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author root
 */
@Remote
public interface SecureBookBeanRemote {
     void addBook(String bookName,String authorName,String publisherName, String synopsis);
    void updateBook(Integer BookID,String bookName,String authorName,String publisherName, String synopsis);   
   void removeBook(Integer BookID);
   List getAllBooks();
}
