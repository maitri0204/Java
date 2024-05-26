package StructuralDesignPattern.DecoratorDesignPattern.Furniture;

public class SimpleDoor implements Door{

    @Override
    public String getDescription() {
        return "Simple Door";
    }

    @Override
    public double cost() {
        return 5000.0;
    }
    
}
