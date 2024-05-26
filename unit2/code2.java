class VarArgsTest{
    // Variable argument function taking one fix parameter sem, and variable number
    // of parameter of type String
    public static void printNames(int sem,String... n){
        for(int i =0 ;i<n.length;i++)
        System.out.println(n[i]);
    }
    // variable Argument function of type int
    public static int add(int... n){
        int sum = 0;
        for(int i=0;i<n.length;i++)
        sum = sum + n[i];
        return sum;
    }
    public static void main(String[]args){
        System.out.println(add());
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2,3,4,5));
        printNames(3,"Strudent 1","Student 2");
        printNames(5, "Student 3", "Student 4","Student 5");
    }
}