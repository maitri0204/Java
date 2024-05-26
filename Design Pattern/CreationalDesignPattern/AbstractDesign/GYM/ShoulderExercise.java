package CreationalDesignPattern.AbstractDesign.GYM;

import javax.xml.transform.Source;

public class ShoulderExercise implements Exercise {

    @Override
    public void displayExercise() {
        System.out.println("Shoulder press" + "\t" + "Lateral rise");
    }
}
