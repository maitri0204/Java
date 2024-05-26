package StructuralDesignPattern.AdapterDesign.Furniture;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Assembling assemble = new Assembling();
        assemble.assemble("Chair", 2500);
        assemble.assemble("Table", 5000);
        assemble.assemble("Sofa", 10000);
    }
}
