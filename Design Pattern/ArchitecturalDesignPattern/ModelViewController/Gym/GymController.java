package ArchitecturalDesignPattern.ModelViewController.Gym;

public class GymController {
    private GymModel model;
    private GymView view;

    public GymController(GymModel model, GymView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayGymDetails(model.getGymName(), model.getNumberOfMembers());
    }

    public void addMember() {
        model.addMember();
        view.displayMessage("Member added successfully!");
        updateView();
    }

    public void removeMember() {
        model.removeMember();
        view.displayMessage("Member removed successfully!");
        updateView();
    }
}
