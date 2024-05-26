//  Describe the multilevel inheritance along with the example.
// class can no be extended id class marked with final
final class A{
    final int number = 10;
    public A(){}
    // if method marked with final it can not be override by derived class
    final public void printing(){
        System.out.println("A is printing!!!");
    }
}
class B extends A{
    public B(){}

    // Method overriding
    public void printing(){
        System.out.println("B is printing!!!");
    }
}
class C extends B{
    public C(){
        // super();
        System.out.println("Default Constructor C");
    }
    public void printing(){
        System.out.println("C is printing!!!");
    }
}
class FinalKeywordTest{
    // Runtime Polymorphism - dynamic method dispatch - dynamic binding
    public static void main(String[] args){
        A c1 = new C();   //  Runtime polymorphism [Upcasting (Converting subClass to superClasss)]
        A b1 = new B();
        c1.printing();
        b1.printing();
    }
}