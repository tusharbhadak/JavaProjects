/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author root
 */
@Stateful
public class StatefulCode implements StatefulCodeLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 int i;
    
    @PostConstruct
    public void initialize()
    {
        i=0;
    }
    

    @Override
    public int increment() {
 
    return i++;
    }

}
