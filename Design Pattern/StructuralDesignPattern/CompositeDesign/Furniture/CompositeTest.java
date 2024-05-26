package StructuralDesignPattern.CompositeDesign.Furniture;

public class CompositeTest {
    public static void main(String[] args) {
        Component table = new Leaf("Table", 10000);
        Component desk_chair = new Leaf("Desk chair", 5000);
        Component sofa = new Leaf("Sofa", 25000);
        Component door = new Leaf("Door", 2000);
        Component recliner = new Leaf("Recliner", 2500);
        Component bed = new Leaf("Bed", 50000);
        Component armchair = new Leaf("Armchair", 1500);

        Composite home = new Composite("Home");
        Composite chair = new Composite("Chair");
        Composite office = new Composite("Office");
        Composite furniture = new Composite("Furniture");

        chair.addComponent(desk_chair);
        chair.addComponent(recliner);
        chair.addComponent(armchair);

        home.addComponent(door);
        home.addComponent(bed);
        home.addComponent(chair);

        office.addComponent(sofa);
        office.addComponent(table);

        furniture.addComponent(home);  
        furniture.addComponent(office);  

        furniture.showPrice();
    }
}
