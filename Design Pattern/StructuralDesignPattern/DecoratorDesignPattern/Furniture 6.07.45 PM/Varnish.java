package StructuralDesignPattern.DecoratorDesignPattern.Furniture;

public class Varnish extends DoorDecorator{

    public Varnish(Door doordecorated) {
        super(doordecorated);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with Varnished Door";
    }

    @Override
    public double cost(){
        return super.cost() + 500.0;
    }
    
}
