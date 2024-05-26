package CreationalDesignPattern.Builder_Class.Phoneexample;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOS("Android").setRAM(8).setBattery(4000).setProcessor("Snapdragon").getPhone();
        System.out.println(p);
    }
}
