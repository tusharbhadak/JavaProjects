/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author root
 */
public class BookMaster {
    
    String txtBookName;
    String txtSynopsis;
    String txtAuthorName;
    String txtPublisherName;

    public BookMaster(String txtBookName, String txtSynopsis, String txtAuthorName, String txtPublisherName) {
        this.txtBookName = txtBookName;
        this.txtSynopsis = txtSynopsis;
        this.txtAuthorName = txtAuthorName;
        this.txtPublisherName = txtPublisherName;
    }

    public BookMaster() {
    }

    public String getTxtBookName() {
        return txtBookName;
    }

    public void setTxtBookName(String txtBookName) {
        this.txtBookName = txtBookName;
    }

    public String getTxtSynopsis() {
        return txtSynopsis;
    }

    public void setTxtSynopsis(String txtSynopsis) {
        this.txtSynopsis = txtSynopsis;
    }

    public String getTxtAuthorName() {
        return txtAuthorName;
    }

    public void setTxtAuthorName(String txtAuthorName) {
        this.txtAuthorName = txtAuthorName;
    }

    public String getTxtPublisherName() {
        return txtPublisherName;
    }

    public void setTxtPublisherName(String txtPublisherName) {
        this.txtPublisherName = txtPublisherName;
    }
    
    
    
}
