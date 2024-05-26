// Q5
// Mobile class
class Mobile {
    private String imeiNumber;
    private String processor;

    // Default constructor with default values
    public Mobile() {
        this.imeiNumber = "DefaultIMEI";
        this.processor = "DefaultProcessor";
    }

    // Parameterized constructor
    public Mobile(String imeiNumber, String processor) {
        this.imeiNumber = imeiNumber;
        this.processor = processor;
    }

    // Basic functionalities
    public void call() {
        System.out.println("Calling...");
    }

    public void receiveCall() {
        System.out.println("Receiving a call...");
    }

    public void sendMessage() {
        System.out.println("Sending a message...");
    }
}

// Nokia class extending Mobile
class Nokia extends Mobile {
    // Parameterized constructor for Nokia
    public Nokia(String imeiNumber, String processor) {
        super(imeiNumber, processor);
    }

    // Additional functionalities
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public void record() {
        System.out.println("Recording...");
    }
}

// Lumia930 class extending Nokia
class Lumia930 extends Nokia {
    private String os;

    // Constructor with additional attribute OS
    public Lumia930(String imeiNumber, String processor) {
        super(imeiNumber, processor);
        this.os = "Windows";
    }

    // Getters and setters for OS
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}

// Main class for testing
class MobileTest {
    public static void main(String[] args) {
        // Creating objects using default constructor
        Mobile mobile1 = new Mobile();
        mobile1.call();
        mobile1.receiveCall();
        mobile1.sendMessage();

        // Creating objects using parameterized constructor
        Mobile mobile2 = new Mobile("CustomIMEI", "CustomProcessor");
        mobile2.call();
        mobile2.receiveCall();
        mobile2.sendMessage();

        // Creating objects of Nokia class
        Nokia nokia = new Nokia("CustomIMEI", "CustomProcessor");
        nokia.call();
        nokia.receiveCall();
        nokia.sendMessage();
        nokia.playMusic();
        nokia.record();

        // Creating objects of Lumia930 class
        Lumia930 lumia930 = new Lumia930("CustomIMEI", "CustomProcessor");
        System.out.println("OS: " + lumia930.getOs());
    }
}