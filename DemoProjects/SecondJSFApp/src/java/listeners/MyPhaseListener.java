/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

//import com.sun.faces.lifecycle.Phase;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author root
 */
public class MyPhaseListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent event) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    if(event.getPhaseId()== PhaseId.RESTORE_VIEW)
        System.out.println("Restore View");
    else if(event.getPhaseId()== PhaseId.APPLY_REQUEST_VALUES)
        System.out.println("Apply Request View");
    else if(event.getPhaseId()== PhaseId.PROCESS_VALIDATIONS)
        System.out.println("Apply validation View");
    
    }

    @Override
    public void beforePhase(PhaseEvent event) {
  if(event.getPhaseId()== PhaseId.RESTORE_VIEW)
        System.out.println("Restore View");
    else if(event.getPhaseId()== PhaseId.APPLY_REQUEST_VALUES)
        System.out.println("Apply Request View");
    else if(event.getPhaseId()== PhaseId.PROCESS_VALIDATIONS)
        System.out.println("Apply validation View");
      }

    @Override
    public PhaseId getPhaseId() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return PhaseId.ANY_PHASE;
    }
    
}
