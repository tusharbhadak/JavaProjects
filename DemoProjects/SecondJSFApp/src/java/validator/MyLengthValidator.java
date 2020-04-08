/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author root
 */
@FacesValidator("MyLengthValidator")
public class MyLengthValidator implements Validator {

    @Override
    public void validate(FacesContext ctx, UIComponent ui, Object obj) throws ValidatorException {
  
    String str = (String) obj;
    
    if(str.length()<=3)
    {
        FacesMessage message = new FacesMessage("The length sould not be less than 3 characters");
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
        
    }
    
    
    }
    
}
