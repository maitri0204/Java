package CreationalDesignPattern.Builder_Class.Gym_Exercise;

public class Gym {
    private String Exercises;
    private String Muscle;
    private int sets;
    private int reps;

    public void setExercises(String e){
        this.Exercises = e;
    }

    public void setMuscle(String m){
        this.Muscle = m;
    }

    public void setsets(int s){
        this.sets = s;
    }

    public void setreps(int r){
        this.reps = r;
    }
    
    public void GymDetails(){
        System.out.println("GYM \n Exercise: " + Exercises + "\n Muscle: " + Muscle + "\n Number of sets: " + sets + "\n Number of reps: " + reps);
    }
}
