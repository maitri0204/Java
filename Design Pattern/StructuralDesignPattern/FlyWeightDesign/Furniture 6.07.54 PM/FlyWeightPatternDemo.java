package StructuralDesignPattern.FlyWeightDesign.Furniture;

public class FlyWeightPatternDemo {
    private static final String materials[] = {"Wood", "Metal", "Plastic"};

    public static void main(String[] args) {
        for(int i=0; i<=20; i++){
            Chair chair = (Chair) FurnitureFactory.getFurniture(getRandomMaterial());
            chair.setLegs(getRandomLegs());
            chair.assemble();
        }
    }

    private static String getRandomMaterial(){
        return materials[(int)(Math.random()*materials.length)];
    }

    private static int getRandomLegs(){
        // Simulating different number of legs for chairs
        return (int)(Math.random() * 4) + 1; // Random number between 1 and 4
    }
}