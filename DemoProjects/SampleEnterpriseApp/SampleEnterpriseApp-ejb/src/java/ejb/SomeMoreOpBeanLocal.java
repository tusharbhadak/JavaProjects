/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface SomeMoreOpBeanLocal {
    
    String concatenate(String str1, String str2);
    String extractStr(String str, int pos);
    
}
