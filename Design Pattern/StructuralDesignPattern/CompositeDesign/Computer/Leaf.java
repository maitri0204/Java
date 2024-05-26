package StructuralDesignPattern.CompositeDesign.Computer;

public class Leaf implements Component {

    int price;
    String name;

    // Paramaterized Constructor
    Leaf(int p, String n){
        this.price = p;
        this.name = n;
    }

    @Override
    public void showPrice() {
        System.out.println("Leaf -> " + name + ":" + price);
    }

    @Override
    public int getPrice() {
        return price;
    }
    
}
