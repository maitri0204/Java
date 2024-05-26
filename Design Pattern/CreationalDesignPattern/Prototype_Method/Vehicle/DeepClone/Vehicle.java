package CreationalDesignPattern.Prototype_Method.Vehicle.DeepClone;

import java.util.*;
import java.util.ArrayList;

public class Vehicle implements Cloneable{
    private List<String>vehiclelist;
    public Vehicle(){
        this.vehiclelist = new ArrayList<String>();
    }

    public Vehicle(List<String> List){
        this.vehiclelist = List;
    }

    public void InsertData(){
        vehiclelist.add("Honda Amaze");
        vehiclelist.add("Audi Ad");
        vehiclelist.add("Hyundi");
        vehiclelist.add("Maruti Baleno");
        vehiclelist.add("Renault Duster");
    }

    public List<String> getVehicleList(){
        return this.vehiclelist;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<String>();
        
        for(String s:this.vehiclelist){
            tempList.add(s);
        }
        return new Vehicle(tempList);
    }
}

