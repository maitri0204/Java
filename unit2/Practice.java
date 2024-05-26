import java.util.function.DoubleConsumer;

import org.w3c.dom.css.ElementCSSInlineStyle;

class Bill{
    int no_of_unit;
    int charge;
    int billID;
    static int count=0;

    {
        count++;
    }

    // Default Constructor
    public Bill(){
        no_of_unit = 30;
        charge = 6;
        billID = 0;
    }

    // Parameterised Constructor
    public Bill(int n,int c){
        no_of_unit = n;
        charge = c;
    }

    // Copy Constructor
    public Bill(Bill t){
        no_of_unit = t.no_of_unit;
        charge = t.charge;
    }

    // Getter method
    public int getUnit(){
        return no_of_unit;
    }
    public int getCharge(){
        return charge;
    }

    // Setter method
    public void setUnit(int n){
        no_of_unit = n;
    }
    public void setCharge(int c){
        charge = c;
    }

    public void printDetails(){
        System.out.println(no_of_unit + "\t" + charge + "\t" + billID);
    }
    public double calculateBillAmount(){
        return (no_of_unit * charge);
    }

    // Static field for count
    static void totalBillCount(){
        System.out.println(count);
    }
}

// Overridden calculateBillAmount
class ElectricityBill extends Bill{
    public double calculateBillAmount(){
        return ((no_of_unit) * (charge)) + 0.02*((no_of_unit)*(charge));
    }
}

// Overridden printBillDetails and calculateBillAmount
class MilkBill extends Bill{

    int supplierCharge = 50;

    public void printDetails(){
        System.out.println(no_of_unit+ "\t"+ charge + "\t"+ supplierCharge);
    }

    public double calculateBillAmount(){
        return((no_of_unit*charge)+supplierCharge);
    }
}

class test{
    public static void main(String[] args) {
        Bill b1 = new Bill();   // Creating object for Bill
        b1.printDetails();  //Calling the method printDetails for printing the details of Bill
        b1.calculateBillAmount();   //Calling method calculateBillAmount for calculating the Billamount of 
        b1.setCharge(5);    //Setting the value in Charge
        b1.setUnit(3);  //Setting the value in Unit
        b1.printDetails();  //Printing the details of bill which is entered
        System.out.println("Bill Amount " + b1.calculateBillAmount());
        ElectricityBill e1 = new ElectricityBill();     //Creating the object for ElectricityBill
        b1.totalBillCount();    // Calling the method for showing BillCount
        System.out.println("ElectricityBill " + e1.calculateBillAmount());  //Printing the ElectricityBill
        MilkBill m1 = new MilkBill();   //Creating the object for MilkBill
        System.out.println("MilkBill "+m1.calculateBillAmount());   //Printing the milkbill
        Bill e3 = new ElectricityBill();    //Runtime Polymorphism
        System.out.println("Bill Amount" + e3.calculateBillAmount());
    }
}
