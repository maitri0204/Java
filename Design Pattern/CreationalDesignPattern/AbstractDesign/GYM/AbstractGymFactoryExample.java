package CreationalDesignPattern.AbstractDesign.GYM;

public class AbstractGymFactoryExample {
    public static void main(String[] args) {
        // FITNESS GYM
        System.out.println("FITNESS GYM");
        MuscleFactory backmuscle = new BackFactory();
        Muscle back = backmuscle.createMuscle();
        Exercise b_exercise = backmuscle.createExercise();

        back.displayMuscle();
        b_exercise.displayExercise();
        System.out.println("");

        // OMG FITNESS
        System.out.println("OMG FITNESS");
        MuscleFactory shouldermuscle = new ShoulderFactory();
        Muscle shoulder = shouldermuscle.createMuscle();
        Exercise s_exercise = shouldermuscle.createExercise();

        shoulder.displayMuscle();
        s_exercise.displayExercise();
        System.out.println("");

        // EMPOWER GYM
        System.out.println("EMPOWER GYM");
        MuscleFactory legmuscle = new LegFactory();
        Muscle legs = legmuscle.createMuscle();
        Exercise l_exercise = legmuscle.createExercise();

        legs.displayMuscle();
        l_exercise.displayExercise();;
        System.out.println("");

    }
}
