package CreationalDesignPattern.Builder_Class.Gym_Exercise;

public class Omggym implements GymExercises{
    private Gym G = new Gym();

    @Override
    public void setExercises() {
        G.setExercises("Shoulder press");
    }

    @Override
    public void setMuscle() {
        G.setMuscle("Shoulder");
    }

    @Override
    public void setsets() {
        G.setsets(3);
    }

    @Override
    public void setreps() {
        G.setreps(12);
    }

    @Override
    public Gym getGym(){
        Gym newGym = this.G;
        this.G = new Gym();
        return newGym;
    }
}
