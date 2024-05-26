package CreationalDesignPattern.Builder_Class.Gym_Exercise;

public class Fitnessgym implements GymExercises{
    private Gym G = new Gym();

    @Override
    public void setExercises() {
        G.setExercises("Deadlift");
    }

    @Override
    public void setMuscle() {
        G.setMuscle("Back");
    }

    @Override
    public void setsets() {
        G.setsets(3);
    }

    @Override
    public void setreps() {
        G.setreps(10);
    }

    @Override
    public Gym getGym(){
        Gym newGym = this.G;
        this.G = new Gym();
        return newGym;
    }
}
