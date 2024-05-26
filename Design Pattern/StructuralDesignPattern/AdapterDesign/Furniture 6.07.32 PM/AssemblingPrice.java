package StructuralDesignPattern.AdapterDesign.Furniture;

public class AssemblingPrice {
    AdvancedFurniture advancedShop;

    public AssemblingPrice(String type){
        if(type.equals("Chair")){
            advancedShop = new Chair();
        }
        else if(type.equals("Table")){
            advancedShop = new Table();
        }
    }

    public void assemble(String type, int price){
        if(type.equalsIgnoreCase("Chair")){
            advancedShop.assemblechair(price);
        }
        else if(type.equalsIgnoreCase("Table")){
            advancedShop.assembletable(price);
        }
    }
}
