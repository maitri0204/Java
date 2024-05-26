package BehaviouralDesignPattern.StateDesignPattern.Mobile;

public class Ringing implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Mobile is Ringing");
    }
    
}
