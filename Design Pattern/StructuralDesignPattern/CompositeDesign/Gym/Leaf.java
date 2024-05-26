package StructuralDesignPattern.CompositeDesign.Gym;

import java.lang.annotation.Retention;

public class Leaf implements Component {

    String exercise;
    int sets;
    int reps;

    Leaf(String exercise, int sets, int reps){
        this.exercise = exercise;
        this.sets = sets;
        this.reps = reps;
    }
    @Override
    public void showExercise() {
        System.out.println("Leaf -> " + exercise + ":" + sets + "," + reps);
    }

    @Override
    public int getsets() {
        return sets;
    }

    @Override
    public int getreps() {
        return reps;
    }
    @Override
    public void addComponent(Component deadlift) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addComponent'");
    }
}
