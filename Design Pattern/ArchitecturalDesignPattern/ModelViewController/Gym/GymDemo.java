package ArchitecturalDesignPattern.ModelViewController.Gym;

public class GymDemo {
    public static void main(String[] args) {
        // Create model, view, and controller
        GymModel model = new GymModel("FitLife Gym");
        GymView view = new GymView();
        GymController controller = new GymController(model, view);

        // Display initial gym details
        controller.updateView();

        // Add a member
        controller.addMember();

        // Remove a member
        controller.removeMember();
    }
}

