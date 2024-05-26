class Employee{
    protected String eName;
    protected double basicSalary;
    static int count;
    {
        count ++;
    }

    public Employee(){
        eName = "NA";
        basicSalary = 0.0;
    }

    public Employee(String Name, double Salary){
        eName = Name;
        basicSalary = Salary;
    }

    public Employee(Employee e){
        eName = e.eName;
        basicSalary = e.basicSalary;
    }

    public String getName(){
        return eName;
    }

    public void setName(String name){
        eName = name;
    }

    public double getSalary(){
        return basicSalary;
    }

    public void setSalary(double Salary){
        basicSalary = Salary;
    }

    public void printDetails(){
        System.out.println("Name of Employee:" + eName + "\tSalary:" + basicSalary);
    }
}

class SalesManager extends Employee{
    private double salesAmount;

    public SalesManager(){
        super();
        salesAmount = 0;
    }

    public SalesManager(String Name,double Salary,double sa){
        super(Name,Salary);
        salesAmount = sa;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("SalesAmount:" + salesAmount);
    }

    public static int countEmployees(){
        return count;
    }
}

class Employee_SalesManger{
    public static void main(String[] args) {
        Employee e1 = new Employee("ABC", 500000);
        SalesManager s1 = new SalesManager("ABC",400000,3188);
        e1.printDetails();
        s1.printDetails();
    }
}

