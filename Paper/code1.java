class Driver {
    protected int id;
    protected String name;

    public Driver() {
        id = 0;
        name = "NA";
    }

    public Driver(int i, String n) {
        id = i;
        name = n;
    }

    public void printDetails() {
        System.out.println("Id:" + id + "\t Name" + name);
    }
}

class CabDriver extends Driver {
    private int age;
    private int vehicleNumber;
    private String address;

    public CabDriver() {
        super();
        age = 0;
        vehicleNumber = 0;
        address = "NA";
    }

    public CabDriver(int i, String n, int a, int vno, String add) {
        super(i, n);
        age = a;
        vehicleNumber = vno;
        address = add;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Age: " + age + "\t VehicleNumber: " + vehicleNumber + "\t Address" + address);
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String title) {
        super(title);
    }
}

class VehicleValid {
    static public void applyForVehicle(int age) throws InvalidAgeException {
        if (age < 21) {
            throw new InvalidAgeException("Age must be more than 21 to apply");
        } else {
            System.out.println("Can Apply for vehicle!!");
        }
    }
}

public class code1 {
    public static void main(String[] args) {
        Driver d = new Driver(1, "ABC");
        CabDriver cd = new CabDriver(1, "DEF", 31, 1231, "xyz road");
        d.printDetails();
        cd.printDetails();

        try {
            VehicleValid.applyForVehicle(23);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
