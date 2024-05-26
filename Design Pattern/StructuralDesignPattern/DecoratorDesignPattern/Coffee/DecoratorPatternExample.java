package StructuralDesignPattern.DecoratorDesignPattern.Coffee;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Create a simple Coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.cost() + ", Description: " + coffee.getDescription());

        // Decorate the simple Coffee with milk
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.getDescription());

        // Decorate the milk Coffee with Sugar
        Coffee sweetCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sweetCoffee.cost() + ", Description: " + sweetCoffee.getDescription());
    }
}
