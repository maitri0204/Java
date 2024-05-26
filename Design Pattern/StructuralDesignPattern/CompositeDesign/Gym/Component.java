package StructuralDesignPattern.CompositeDesign.Gym;

interface Component {
    void showExercise();
    int getsets();
    int getreps();
    void addComponent(Component deadlift);
}
