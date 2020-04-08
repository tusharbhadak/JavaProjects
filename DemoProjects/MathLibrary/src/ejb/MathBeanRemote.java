/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author root
 */
@Remote
public interface MathBeanRemote {
    
    int add(int x, int y);
    int substract(int x, int y);
    int multiply(int x, int y);
    int divide(int x, int y);
    
}
