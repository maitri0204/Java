import java.util.*;
//  Super Class / Parent Class
class SuperClass{
    protected int number1; //  protected number can be accessable to SubClass
    public SuperClass(){
        number1 = 10;
        System.out.println("SuperClass Default Constructor");
    }
    public SuperClass(int n){
        System.out.println("SuperClass Default Constructor");
    }
    public void printData(){
        System.out.println("SuperClass PrintData - : "+number1);
    }
}

// Sub class - derived class - child class
class SubClass extends SuperClass{
    // SubClass can have their own instance fields
    int number2;
    public void printData(){
        super.printData();
        System.out.println("SubClass PrintData - : "+number1);
    }
        
    // SubClass Default Constructor
    public SubClass(){
        number1 = 20;
        number2 = 30;
        System.out.println("Sub-Class Default Constructor");
    }

    public SubClass(int n1, int n2){
        // super(n1); //  super to call base class constructor
        number1 = n1;
        number2 = n2;
        System.out.println("SubClass int, int Constructor");
    }
}

class InheritanceTest{
    public static void main(String[] args){
        // SuperClass sc = new SuperClass();
        // SubClass sb = new SubClass();
        SuperClass sc = new SubClass();
        // SubClass sb1 = new SubClass(20,30);
        // sb1.printData();
        sc.printData();
    }
}