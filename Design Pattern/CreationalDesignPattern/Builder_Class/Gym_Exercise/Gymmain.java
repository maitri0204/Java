package CreationalDesignPattern.Builder_Class.Gym_Exercise;

public class Gymmain {
    private GymExercises GExercise;

    public Gymmain(GymExercises g){
        this.GExercise = g;
    }

    public void BuildGym(){
        GExercise.setExercises();
        GExercise.setMuscle();
        GExercise.setsets();
        GExercise.setreps();
    }
}
