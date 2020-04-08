/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author root
 */
@FacesConverter("myconverter")
public class MyConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String str="";
  if(value.startsWith("IN"))
  {
      FacesMessage msg = new FacesMessage("You cannot write IN as prefix");
      msg.setSeverity(FacesMessage.SEVERITY_ERROR);
      throw new ConverterException(msg);
  }
  else {
   
            str = "::"+value+"::";
  }
    return str;
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        String str = (String) arg2;
        return str;
    }
    
}
