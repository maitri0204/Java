package CreationalDesignPattern.Builder_Class.Gym_Exercise;

public class GymShop {
    public static void main(String[] args) {
        GymExercises GExercise;
        Gymmain gmain;
        Gym G1;

        GExercise = new Fitnessgym();
        gmain = new Gymmain(GExercise);
        gmain.BuildGym();
        G1 = GExercise.getGym();
        G1.GymDetails();
    }  
}
