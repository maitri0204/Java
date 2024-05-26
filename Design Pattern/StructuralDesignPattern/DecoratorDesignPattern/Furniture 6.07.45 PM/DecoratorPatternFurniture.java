package StructuralDesignPattern.DecoratorDesignPattern.Furniture;

public class DecoratorPatternFurniture {
    public static void main(String[] args) {
        Door door = new SimpleDoor();
        System.out.println("Cost: " + door.cost() + ", Description: " + door.getDescription());

        Door paintdoor = new PaintDoor(door);
        System.out.println("Cost: " + paintdoor.cost() + ", Description: " + paintdoor.getDescription());

        Door varnishdoor = new Varnish(door);
        System.out.println("Cost: " + varnishdoor.cost() + ", Description: " + varnishdoor.getDescription());
    }
}
