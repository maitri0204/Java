package CreationalDesignPattern.Prototype_Method.Vehicle.Prototype_Method_Vehicle;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;

public class PrototypePatterExample {
    public static void main(String[] args) throws CloneNotSupportedException{
        // Vehicle v = new Vehicle();
        // v.InsertData();
        // List<String> list2 = new ArrayList<String>();
        // list2.add("Bike1");
        // list2.add("Bike2");
        // list2.add("Bike3");
        // list2.add("Bike4");
        // System.out.println(v.getVehicleList());
        // Vehicle b = new Vehicle(list2);
        // System.out.println(b.getVehicleList());

        Vehicle v = new Vehicle();
        v.InsertData();
        System.out.println("A" + v.getVehicleList());
        System.out.println("B:" + v.getVehicleList());


    }
}
