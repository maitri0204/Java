package StructuralDesignPattern.FlyWeightDesign.Furniture;

import java.util.HashMap;

public class FurnitureFactory {
    private static final HashMap<String, Furniture> furnitureMap = new HashMap<>();

    public static Furniture getFurniture(String material){
        Furniture furniture = furnitureMap.get(material);

        if(furniture == null){
            furniture = new Chair(material);
            furnitureMap.put(material, furniture);
            System.out.println("Creating a " + material + " chair.");
        }
        return furniture;
    }
}
