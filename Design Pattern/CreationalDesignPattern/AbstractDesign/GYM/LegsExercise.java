package CreationalDesignPattern.AbstractDesign.GYM;

public class LegsExercise implements Exercise {

    @Override
    public void displayExercise() {
        System.out.println("Squats" + "\t" + "Leg-extension");
    }
}
