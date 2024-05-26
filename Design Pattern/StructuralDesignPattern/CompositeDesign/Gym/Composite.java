package StructuralDesignPattern.CompositeDesign.Gym;

import java.util.ArrayList;
import java.net.ResponseCache;
import java.util.*;;

public class Composite implements Component{

    String exercise;
    List<Component> components = new ArrayList<>();

    public Composite(String exercise){
        super();
        this.exercise = exercise;
    }

    public void addComponent(Component com){
        components.add(com);
    }

    @Override
    public void showExercise() {
        System.out.println("Composite -> " + exercise + "\t Sets: " + getsets() + "\t Reps: " + getreps());
        System.out.println("Leaf -> " + exercise);
        for(Component c:components){
            c.showExercise();
        }
    }

    @Override
    public int getsets() {
        int s=0;
        for(Component c:components){
            s += c.getsets();
        }
        return s;
    }

    @Override
    public int getreps() {
        int r=0;
        for(Component c:components){
            r += c.getreps();
        }
        return r;
    }
    
}
