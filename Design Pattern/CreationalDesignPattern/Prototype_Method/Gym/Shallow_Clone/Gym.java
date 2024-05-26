package CreationalDesignPattern.Prototype_Method.Gym.Shallow_Clone;
import java.util.*;

public class Gym implements Cloneable{
    private List<String> ExerciseList;

    public Gym(){
        this.ExerciseList = new ArrayList<String>();
    }

    public Gym(List<String> list){
        this.ExerciseList = list;
    }

    public void InsertData(){
        ExerciseList.add("Deadlift");
        ExerciseList.add("Squats");
        ExerciseList.add("Shoulder press");
        ExerciseList.add("Biceps curls");
        ExerciseList.add("One-arm extension");
    }

    public List<String> getExerciseList(){
        return this.ExerciseList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
