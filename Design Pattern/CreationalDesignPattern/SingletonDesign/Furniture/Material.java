package CreationalDesignPattern.SingletonDesign.Furniture;

import java.util.regex.MatchResult;

public class Material {
    private static Material woodsheet1 = new Material();
    public int sheet_area;

    // Private Constructor
    private Material(){
        System.out.println("Wooden sheet used...");
    }

    // Global Access Point
    public static Material getMaterial(){
        return woodsheet1;
    }

    // Getter Methods
    public int getArea(){
        return sheet_area;
    }

    // Setter Methods
    public void setMaterial(int ar){
        this.sheet_area = ar;
    }
}

class Test{
    public static void main(String[] args) {
        Material m1 = Material.getMaterial();
        Material m2 = Material.getMaterial();

        m1.setMaterial(20);
        m2.setMaterial(30);
        System.out.println("Material used by carpenter1: " + m1.getArea());

        m2.sheet_area = m1.sheet_area - m2.sheet_area;
        System.out.println("Material  for carpenter2: " + m2.getArea());

        print("Carpenter1: ", m1);
        print("Carpenter2: ", m2);
    }

    static void print(String name, Material obj){
        System.out.println(String.format("Object: %s, Hashcode: %d", name, obj.hashCode()));
    }
}