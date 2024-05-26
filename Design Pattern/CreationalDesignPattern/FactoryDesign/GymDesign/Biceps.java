package CreationalDesignPattern.FactoryDesign.GymDesign;

public class Biceps implements GymDesign{
    public void Exercise(){
        System.out.println("Hammer curls" + "\t" + "Biceps curls");
    }
}
