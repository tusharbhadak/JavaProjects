/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.DependsOn;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.UserTransaction;

/**
 *
 * @author root
 */
@TransactionManagement(TransactionManagementType.BEAN)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@Startup
@Singleton
@LocalBean
@AccessTimeout(value = 120, unit = TimeUnit.SECONDS)
@DependsOn({"FirstBean", "SecondBean"})
public class SingleBean {
    
    @Resource SessionContext ctx;
    @Resource UserTransaction utx;

    int x;
    int y;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

@PostConstruct    
public void initialization()
{
    x=0; y=0;
    System.out.println("Single Bean is Initialized ....");
}

    @Lock(LockType.READ)
    public int getX() {
        return x;
    }
    @Lock(LockType.WRITE)
    public void setX(int x) {
        this.x = x;
    }
 @Lock(LockType.READ)
    public int getY() {
        return y;
    }
  @Lock(LockType.WRITE)
    public void setY(int y) {
        this.y = y;
    }

    public int getTotal()
    {
        int total=0;
        try{
            utx.begin();
            x=9; y= 10;
        total = x+y;
            utx.commit();
        }
        catch(Exception e)
        {
            try{
            utx.setRollbackOnly();
            }
            catch(Exception e1)
            {
                
            }
        }
        
        return total;
    }


}
