package CreationalDesignPattern.FactoryDesign;
import java.lang.management.OperatingSystemMXBean;

import javax.lang.model.util.ElementScanner14;

public interface OS{
    public void spec();
}

class Android implements OS{
    public void spec(){
        System.out.println("Most powerful OS");
    }
}

class IOS implements OS{
    public void spec(){
        System.out.println("Most Secure OS");
    }
}

class Windows implements OS{
    public void spec(){
        System.out.println("I am about to die");
    }
}
class OperatingSystemFactory{
    public OS getInstance(String str)
    {
        if(str.equals("Open")){
            return new Android();
        }
        else if(str.equals("Closed")){
            return new IOS();
        }
        else{
            return new Windows();
        }
    }
}
class FactoryMain{
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}