// Q7
import java.util.Scanner;

class EmployeeSalaryCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of working hours: ");
        int workingHours = scanner.nextInt();

        System.out.print("Enter the hourly allowance: ");
        double hourlyAllowance = scanner.nextDouble();

        try {
            double totalSalary = calculateSalary(workingHours, hourlyAllowance);
            System.out.println("Total Salary: $" + totalSalary);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    private static double calculateSalary(int workingHours, double hourlyAllowance) {
        if (workingHours <= 0) {
            throw new IllegalArgumentException("Working hours must be greater than 0.");
        }

        return workingHours * hourlyAllowance;
    }
}