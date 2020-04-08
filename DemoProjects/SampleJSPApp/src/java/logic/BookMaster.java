/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author root
 */
public class BookMaster {
    
    String bookName;
    String authorName;
    String publisherName;
    String synopsis;

    public BookMaster(String bookName, String authorName, String publisherName, String synopsis) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.synopsis = synopsis;
    }

    public BookMaster() {
        
        bookName="";
        authorName="";
        publisherName="";
        synopsis="";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    
    
    
    
}
