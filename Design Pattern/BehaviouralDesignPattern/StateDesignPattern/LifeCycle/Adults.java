package BehaviouralDesignPattern.StateDesignPattern.LifeCycle;

public class Adults implements LifeCycleAlertState {

    @Override
    public void alert() {
        System.out.println("Human is in adult state");
    }
    
}
