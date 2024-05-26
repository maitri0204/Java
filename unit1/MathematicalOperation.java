import java.util.*;
public class MathematicalOperation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter first number: ");
        double a = scan.nextDouble();
        System.out.println ("Enter second number: ");
        double b = scan.nextDouble();
        System.out.println("Addition is:" + (a+b));
        System.out.println("Subtraction is:" + (a-b));
        System.out.println("Multipication is:" + (a*b));
        System.out.println("Division is:" + (a/b));
    }
}
