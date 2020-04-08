/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author root
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/ictqueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class SecondQueueBean implements MessageListener {
    
    public SecondQueueBean() {
    }
    
   @Override
    public void onMessage(Message message) {
        try{
        if(message instanceof TextMessage)
        {
            TextMessage msg = (TextMessage) message;
            String content = msg.getText();
            System.out.println("Second QueueBean Got the message : "+ content);
        }
        }
        catch(JMSException e)
        {
            e.printStackTrace();
        }
    }
    
}
