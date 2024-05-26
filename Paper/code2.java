import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class code2 {
    public static void main(String[] args) {
        String fileName = "CustomerDetails.txt"; // Replace with the actual path if needed

        // Accept the name of the customer from the user
        // For simplicity, you can assume that the input is valid (no error checking)
        String searchName = "Ram"; // Replace with user input

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean customerFound = false;

            // Read each line of the file
            while ((line = br.readLine()) != null) {
                // Split the line into name, address, and mobile number using comma as a delimiter
                String[] customerDetails = line.split(", ");

                // Check if the first element (name) matches the search name
                if (customerDetails.length >= 1 && customerDetails[0].equals(searchName)) {
                    // Print details if the customer is found
                    System.out.println("Customer Details:");
                    System.out.println("Name: " + customerDetails[0]);
                    System.out.println("Address: " + customerDetails[1]);
                    System.out.println("Mobile Number: " + customerDetails[2]);
                    customerFound = true;
                    break; // Stop searching once the customer is found
                }
            }

            if (!customerFound) {
                System.out.println("Customer not found with name: " + searchName);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
