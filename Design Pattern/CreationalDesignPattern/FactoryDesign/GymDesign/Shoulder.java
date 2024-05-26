package CreationalDesignPattern.FactoryDesign.GymDesign;

public class Shoulder implements GymDesign{
    public void Exercise(){
        System.out.println("Shoulder press" + "\t" + "Lateral rise" + "\t" + "Front rise");
    }
}
