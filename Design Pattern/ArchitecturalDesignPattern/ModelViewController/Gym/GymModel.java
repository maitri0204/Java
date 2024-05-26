package ArchitecturalDesignPattern.ModelViewController.Gym;

public class GymModel {
    private String gymName;
    private int numberOfMembers;

    public GymModel(String gymName) {
        this.gymName = gymName;
        this.numberOfMembers = 0; // Initially, no members
    }

    // Getter methods
    public String getGymName() {
        return gymName;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    // Method to add a member
    public void addMember() {
        numberOfMembers++;
    }

    // Method to remove a member
    public void removeMember() {
        if (numberOfMembers > 0) {
            numberOfMembers--;
        }
    }
}
