class Employee{
    int id = 101;
    String name;
    Employee(int id,String s){
        this.id = id;
        name = s;
    }
    // Overiide equals(Object o) method from java.lang.Object class
    public boolean equals(Object other){
        Employee emp = (Employee) other;

        return(this.id == emp.id);
    }
    ////Overridden toString() method form java.lang.Object class
    public String toString(){
        return "Id:" + id + " and name:" + name;
    }
}

class ObjectClassTest1{
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Emp1");
        Employee e2 = new Employee(101, "Emp1");
        System.out.println(e1);
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
}
