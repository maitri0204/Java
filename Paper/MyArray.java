// Q2
class MyArray {
    float array[];

    public MyArray(float initialValues[]) {
        array = initialValues.clone();
    }

    public void modify(int index, float value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        }
    }

    public void modifyAll(float value) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
    }

    public void display() {
        for (float element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Demonstration with initial values
        float initialValues[] = {1.2f, 3.4f, 5.6f, 7.8f, 9.0f};
        MyArray myArrayObject = new MyArray(initialValues);

        System.out.println("Initial Array:");
        myArrayObject.display();

        // Calling modify() method
        myArrayObject.modify(2, 10.5f);

        System.out.println("\nArray after modifying element at index 2:");
        myArrayObject.display();

        // Calling modifyAll() method
        myArrayObject.modifyAll(5);

        System.out.println("\nArray after adding 5 to all elements:");
        myArrayObject.display();
    }
}