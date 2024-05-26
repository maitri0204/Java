package CreationalDesignPattern.Builder_Class.Phoneexample;

public class PhoneBuilder1 {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public PhoneBuilder1 setOS(String os){
        this.os = os;
        return this;
    }

    public PhoneBuilder1 setRAM(int ram1){
        this.ram = ram1;
        return this;
    }

    public PhoneBuilder1 setProcessor(String processor1){
        this.processor = processor1;
        return this;
    }

    public PhoneBuilder1 setScreensize(double screensize1){
        this.screensize = screensize1;
        return this;
    }

    public PhoneBuilder1 setBattery(int battery1){
        this.battery = battery1;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, processor, screensize, battery);
    }
}
