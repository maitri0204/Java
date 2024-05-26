package StructuralDesignPattern.DecoratorDesignPattern.Furniture;

public class PaintDoor extends DoorDecorator {

    public PaintDoor(Door doordecorated) {
        super(doordecorated);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with Paint Door";
    }

    @Override
    public double cost(){
        return super.cost() + 2000.0;
    }
    
}
