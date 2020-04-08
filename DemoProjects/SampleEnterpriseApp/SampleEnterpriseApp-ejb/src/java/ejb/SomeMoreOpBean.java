/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@Stateless
public class SomeMoreOpBean implements SomeMoreOpBeanLocal {

    @Override
    public String concatenate(String str1, String str2) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    return str1 + "  "+ str2;
    }

    @Override
    public String extractStr(String str, int pos) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return str.substring(pos);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


}
