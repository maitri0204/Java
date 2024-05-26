package StructuralDesignPattern.CompositeDesign.Gym;

public class CompositeTest {
    public static void main(String[] args) {
        Component deadlift = new Leaf("Deadlift", 3, 12);
        Component lat_pulldown = new Leaf("Lat pulldown", 3, 12);
        Component biceps_curl = new Leaf("Biceps curls", 3, 15);
        Component hammer = new Leaf("Hammer curls", 3, 15);
        Component chest_press = new Leaf("Chest press", 3, 12);
        Component cable_fly = new Leaf("Cable fly", 3, 12);
        Component dips = new Leaf("Triceps dips", 3, 15);
        Component overhead = new Leaf("Overhead extension", 3, 10);
        Component s_press = new Leaf("Shoulder press", 3, 12);
        Component lateral = new Leaf("Lateral rise", 3, 15);
        Component squats = new Leaf("Squats", 3, 15);
        Component l_extension = new Leaf("Leg extension", 3, 15);

        Component pull = new Composite("Pull day");
        Component push = new Composite("Push day");
        Component legs = new Composite("Legs day");
        Component back = new Composite("Back");
        Component bicep = new Composite("Biceps");
        Component chest = new Composite("Chest");
        Component shoulder = new Composite("Shoulder");
        Component triceps = new Composite("Triceps");
        Component gym = new Composite("Gym");

        back.addComponent(deadlift);
        back.addComponent(lat_pulldown);

        bicep.addComponent(biceps_curl);
        bicep.addComponent(hammer);

        chest.addComponent(chest_press);
        chest.addComponent(cable_fly);

        triceps.addComponent(dips);
        triceps.addComponent(overhead);

        shoulder.addComponent(s_press);
        shoulder.addComponent(lateral);

        legs.addComponent(squats);
        legs.addComponent(l_extension);

        pull.addComponent(back);
        pull.addComponent(bicep);

        push.addComponent(chest);
        push.addComponent(shoulder);
        push.addComponent(triceps);

        gym.addComponent(push);
        gym.addComponent(pull);
        gym.addComponent(legs);

        gym.showExercise();
    }
}
