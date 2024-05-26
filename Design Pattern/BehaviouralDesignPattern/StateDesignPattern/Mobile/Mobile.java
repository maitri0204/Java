package BehaviouralDesignPattern.StateDesignPattern.Mobile;

public class Mobile {
    public static void main(String[] args) {
        MobileContext mc = new MobileContext();
        mc.alert();
        mc.setState(new Silent());
        mc.alert();
        System.out.println("Set to Ringing again");
        mc.setState(new Ringing());
        mc.alert();
    }
}
