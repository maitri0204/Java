package CreationalDesignPattern.AbstractDesign.GYM;

public class ShoulderFactory implements MuscleFactory {

    @Override
    public Muscle createMuscle() {
        return new ShoulderMuscle();
    }

    @Override
    public Exercise createExercise() {
        return new ShoulderExercise();
    }
    
}
