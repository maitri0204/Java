package BehaviouralDesignPattern.StateDesignPattern.LifeCycle;

public class Teenager implements LifeCycleAlertState {

    @Override
    public void alert() {
        System.out.println("Human is in teenager state");
    }
    
}
