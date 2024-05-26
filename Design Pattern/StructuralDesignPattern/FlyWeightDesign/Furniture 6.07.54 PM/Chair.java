package StructuralDesignPattern.FlyWeightDesign.Furniture;

public class Chair implements Furniture {

    private String material;
    private int legs;

    public Chair(String material){
        this.material = material;
        this.legs = 4; // Default number of legs for a chair
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling a " + material + " chair with " + legs + " legs.");
    }
}