package BehaviouralDesignPattern.StateDesignPattern.LifeCycle;

public class Baby implements LifeCycleAlertState {

    @Override
    public void alert() {
        System.out.println("Human is in baby state");
    }
    
}
