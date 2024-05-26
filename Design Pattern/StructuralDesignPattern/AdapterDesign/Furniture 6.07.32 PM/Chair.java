package StructuralDesignPattern.AdapterDesign.Furniture;

public class Chair implements AdvancedFurniture {

    @Override
    public void assemblechair(int price) {
        System.out.println("Assembling chair | Price: " + price);
    }

    @Override
    public void assembletable(int price) {
        
    }
    
}
