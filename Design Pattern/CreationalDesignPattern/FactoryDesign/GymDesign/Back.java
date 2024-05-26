package CreationalDesignPattern.FactoryDesign.GymDesign;

public class Back implements GymDesign{
    public void Exercise(){
        System.out.println("Deadlift" + "\t" + "Seated cable" + "\t" + "Lat pulldown");
    }
}
