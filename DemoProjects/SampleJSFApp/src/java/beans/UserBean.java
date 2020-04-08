/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author root
 */
public class UserBean {
    
    String uname;

    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
    public String onSubmit()
    {
      return "failure";  
    }
    
}
