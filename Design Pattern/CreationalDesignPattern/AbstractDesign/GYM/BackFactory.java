package CreationalDesignPattern.AbstractDesign.GYM;


public class BackFactory implements MuscleFactory {

    @Override
    public Muscle createMuscle() {
        return new BackMuscle();
    }

    @Override
    public Exercise createExercise() {
        return new BackExercise();
    }
    
}
