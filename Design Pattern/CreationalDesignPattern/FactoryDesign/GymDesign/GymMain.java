package CreationalDesignPattern.FactoryDesign.GymDesign;

public class GymMain {
    public static void main(String[] args) {
        GymExercise g1 = new GymExercise();
        GymDesign exercise = g1.GymExercise("Back");
        exercise.Exercise();
    }
}
