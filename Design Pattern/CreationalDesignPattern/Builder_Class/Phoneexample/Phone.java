package CreationalDesignPattern.Builder_Class.Phoneexample;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public Phone(String o, int r, String p, double s, int b){
        this.os = o;
        this.ram = r;
        this.processor = p;
        this.screensize = s;
        this.battery = b;
    }

    @Override
    public String toString(){
        return "Phone \n OS: " + os + "\n RAM: " + ram + "\n Processor " + processor + "\n Screensize: " + screensize + "\n Battery: " + battery;
    }
}
