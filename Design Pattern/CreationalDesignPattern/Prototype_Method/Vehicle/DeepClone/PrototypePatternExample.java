package CreationalDesignPattern.Prototype_Method.Vehicle.DeepClone;

import java.util.ArrayList;
import java.util.*;

public class PrototypePatternExample {
    public static void main(String[] args) throws CloneNotSupportedException{
        Vehicle a = new Vehicle();
        a.InsertData();
        Vehicle b = (Vehicle) a.clone();
        System.out.println("A: " + a.getVehicleList());
        System.out.println("B: " + b.getVehicleList());

        List<String> list = b.getVehicleList();
        list.add("Honda New Amaze");
        System.out.println("B: " + b.getVehicleList());

        b.getVehicleList().remove("Audi Ad");
        System.out.println("B: " + list);
        System.out.println("A: " + a.getVehicleList());
    }
}
