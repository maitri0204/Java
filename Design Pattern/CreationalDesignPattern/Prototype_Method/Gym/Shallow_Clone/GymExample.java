package CreationalDesignPattern.Prototype_Method.Gym.Shallow_Clone;
import java.util.*;

public class GymExample {
    public static void main(String[] args) throws CloneNotSupportedException{
        Gym g1 = new Gym();
        g1.InsertData();
        Gym g2 = (Gym) g1.clone();
        System.out.println("Exercise List 1: " + g1.getExerciseList());
        System.out.println("Exercise List 2: " + g2.getExerciseList());

        System.out.println("Lists After Adding an element to Exercise List 2:");
        List<String> list = g2.getExerciseList();
        list.add("Bench press");

        System.out.println("Exercise List 1: " + g1.getExerciseList());
        System.out.println("Exercise List 2: " + g2.getExerciseList());

    }
}
