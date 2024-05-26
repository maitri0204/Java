package BehaviouralDesignPattern.StateDesignPattern.Mobile;

import java.rmi.server.ObjID;

public class MobileContext {
    private MobileAlertState currentState;
    public MobileContext(){
        currentState = new Ringing();
    }

    public void setState(MobileAlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert();
    }
}
