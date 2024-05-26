package BehaviouralDesignPattern.StateDesignPattern.LifeCycle;


public class LifeCycleContext{
    private LifeCycleAlertState currentState;
    public LifeCycleContext(){
        currentState = new Baby();
    }

    public void setState(LifeCycleAlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert();
    }
}
