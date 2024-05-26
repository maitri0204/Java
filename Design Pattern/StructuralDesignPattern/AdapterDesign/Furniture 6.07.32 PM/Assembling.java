package StructuralDesignPattern.AdapterDesign.Furniture;

public class Assembling implements Furniture {

    @Override
    public void assemble(String type, int price) {
        if(type.equalsIgnoreCase("Chair")){
            System.out.println("Assembling chair | Price: " + price);
        }
        else if(type.equalsIgnoreCase("Table")){
            System.out.println("Assembling table | Price: " + price);
        }
        else{
            System.out.println("Invalid Furniture: " + type + "Furniture not available");
        }
    }
    
}
