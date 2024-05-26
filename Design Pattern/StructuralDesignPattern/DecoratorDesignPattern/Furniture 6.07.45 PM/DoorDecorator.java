package StructuralDesignPattern.DecoratorDesignPattern.Furniture;

abstract class DoorDecorator implements Door {

    protected Door doordecorated;

    public DoorDecorator(Door doordecorated){
        this.doordecorated = doordecorated;
    }

    @Override
    public String getDescription() {
        return doordecorated.getDescription();
    }

    @Override
    public double cost() {
        return doordecorated.cost();
    }
    
}
