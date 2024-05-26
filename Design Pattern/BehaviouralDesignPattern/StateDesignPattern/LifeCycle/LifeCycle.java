package BehaviouralDesignPattern.StateDesignPattern.LifeCycle;

public class LifeCycle {
    public static void main(String[] args) {
        LifeCycleContext lcc = new LifeCycleContext();
        lcc.alert();
        lcc.setState(new Teenager());
        lcc.alert();
        lcc.setState(new Adults());
        lcc.alert();
        lcc.setState(new SeniorCitizen());
        lcc.alert();
        lcc.setState(new Dead());
        lcc.alert();
    }
}
