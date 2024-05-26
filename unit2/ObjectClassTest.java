import javax.sound.sampled.SourceDataLine;

class Employee{}
class SalesPerson extends Employee{}
class ObjectClassTest{
    public static void main(String[] args) {
        /*Class c1 = SalesPerson.class;   //Class - representation
        System.out.println(c1.getName());

        Class sc = c1.getSuperclass();

        System.out.println(sc.getName()); */

        Class c1 = Employee.class;   //Class - representation
        System.out.println(c1.getName());

        Class sc = c1.getSuperclass();

        System.out.println(sc.getName());
    }
}
