package CreationalDesignPattern.AbstractDesign.GYM;

public class LegFactory implements MuscleFactory{

    @Override
    public Muscle createMuscle() {
        return new LegMuscle();
    }

    @Override
    public Exercise createExercise() {
        return new LegsExercise();
    }
    
}
