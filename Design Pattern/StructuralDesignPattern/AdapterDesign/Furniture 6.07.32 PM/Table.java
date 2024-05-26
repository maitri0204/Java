package StructuralDesignPattern.AdapterDesign.Furniture;

public class Table implements AdvancedFurniture{

    @Override
    public void assemblechair(int price) {
        
    }

    @Override
    public void assembletable(int price) {
        System.out.println("Assembling Table | Price: " + price);
    }
    
}
