// Q3
class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Method demonstrating call by reference
    public void incrementValue(MyClass obj) {
        obj.setValue(obj.getValue() + 1);
    }

    // Method demonstrating returning an object
    public static MyClass createObject(int value) {
        return new MyClass(value);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating objects and references
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = obj1; // Creating a reference to obj1

        System.out.println("Initial Values:");
        System.out.println("obj1: " + obj1.getValue());
        System.out.println("obj2: " + obj2.getValue());

        // Demonstrating call by reference
        obj1.incrementValue(obj1);
        System.out.println("\nAfter incrementing obj1 by reference:");
        System.out.println("obj1: " + obj1.getValue());
        System.out.println("obj2: " + obj2.getValue());

        // Demonstrating returning an object
        MyClass obj3 = MyClass.createObject(5);
        System.out.println("\nAfter creating a new object and returning it:");
        System.out.println("obj3: " + obj3.getValue());
    }
}