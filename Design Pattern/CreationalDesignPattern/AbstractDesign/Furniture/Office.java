package CreationalDesignPattern.AbstractDesign.Furniture;

import javax.sound.sampled.SourceDataLine;

public class Office implements Utility{

    @Override
    public void displayUtility() {
        System.out.println("Meant ot be used in office");
    }
    
}
