package CreationalDesignPattern.AbstractDesign.Tech;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // SAMSUNG FACTORY
        System.out.println("SAMSUNG FACTORY");
        MobileFactory samsungfactory = new SamsungFactory();
        Mobile samsungs24 = samsungfactory.CreateMobile();
        OS ONEUI = samsungfactory.CreateOS();

        samsungs24.displayInfo();
        ONEUI.displayOS();
        System.out.println("");

        // NOKIA FACTORY
        System.out.println("NOKIA FACTORY");
        MobileFactory nokiafactory = new NokiaFactory();
        Mobile nokialumia = nokiafactory.CreateMobile();
        OS nokios = nokiafactory.CreateOS();

        nokialumia.displayInfo();
        nokios.displayOS();
        System.out.println("");

        // APPLE FACTORY
        System.out.println("APPLE FACTORY");
        MobileFactory applefactory = new AppleFactory();
        Mobile iphone15 = applefactory.CreateMobile();
        OS ios17 = applefactory.CreateOS();

        iphone15.displayInfo();
        ios17.displayOS();
        System.out.println("");
    }
}
