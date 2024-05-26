package BehaviouralDesignPattern.StateDesignPattern.LifeCycle;

public class Dead implements LifeCycleAlertState {

    @Override
    public void alert() {
        System.out.println("Human is dead");
    }
    
}
