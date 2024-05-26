package ArchitecturalDesignPattern.ModelViewController.Gym;

public class GymView {
    public void displayGymDetails(String gymName, int numberOfMembers) {
        System.out.println("Gym: " + gymName);
        System.out.println("Number of Members: " + numberOfMembers);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}