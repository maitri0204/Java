package StructuralDesignPattern.DecoratorDesignPattern.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with Milk";
    }
    
    @Override
    public double cost(){
        return super.cost() + 5.5;
    }
}
