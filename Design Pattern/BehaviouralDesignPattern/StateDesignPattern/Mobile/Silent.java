package BehaviouralDesignPattern.StateDesignPattern.Mobile;

public class Silent implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Mobile is Silent");
    }
    
}
