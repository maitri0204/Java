class MyClass {
    int value;
    public MyClass(int value) {
    this.value = value;
    }
    }
    class MethodVariation {
    public static void main(String[] args) {
    int x = 10;
    System.out.println("Before calling passByValue: x = " + x);
    passByValue(x);
    System.out.println("After calling passByValue: x = " + x);
    MyClass obj = new MyClass(20);
    System.out.println("Before calling passByReference: obj.value = " + obj.value);
    passByReference(obj);
    System.out.println("After calling passByReference: obj.value = " + obj.value);
    int result1 = returnValue();
    System.out.println("Value returned from returnValue: " + result1);
    MyClass obj2 = returnObject();
    System.out.println("Value returned from returnObject: obj2.value = " + obj2.value);
    }
    // Pass by value
    public static void passByValue(int a) {
    a = 50;
    System.out.println("Inside passByValue: a = " + a);
    }
    // Pass by reference for objects
    public static void passByReference(MyClass obj) {
    obj.value = 100;
    System.out.println("Inside passByReference: obj.value = " + obj.value);}
    // Return a value from a method
    public static int returnValue() {
    return 30;}
    // Return an object from a method
    public static MyClass returnObject() {
    return new MyClass(40);
    }
    }