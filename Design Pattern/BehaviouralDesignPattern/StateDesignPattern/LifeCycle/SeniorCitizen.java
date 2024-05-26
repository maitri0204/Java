package BehaviouralDesignPattern.StateDesignPattern.LifeCycle;

public class SeniorCitizen implements LifeCycleAlertState{

    @Override
    public void alert() {
        System.out.println("Human is in Senior Citizen state");
    }
    
}
