/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

/**
 *
 * @author root
 */
@Named(value = "userBean")
@RequestScoped
public class UserBean {
String uname;
String password;
String email;
String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
    
    public void promptMe()
    {
        msg="You have entered "+ uname+ " as user name";
    }
    
    public void validateLength(FacesContext ctx, UIComponent ui, Object obj)
    {
        String str = (String) obj;
    
    if(str.length()<=3)
    {
        ((UIInput)ui).setValid(false);
        
        FacesMessage message = new FacesMessage("Bean : The length sould not be less than 3 characters");
       // message.setSeverity(FacesMessage.SEVERITY_ERROR);
       ctx.addMessage(ui.getClientId(ctx), message);
    }
    }
    
//    public String onSubmit()
//    {
//      return "ShowData";  
//    }
    
}
