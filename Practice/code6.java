import java.io.*;
class StudentMarks
{
    	public static void main(String[] args) 
	{
        	String fileName = "markdetails.txt";
        	// Write student names and marks to the file
        	writeMarksToFile(fileName);
        	// Read and print names of students with marks > 70
        	System.out.println("Students with marks more than 70:");
        	readMarksFromFile(fileName);
    	}
    	// Function to write student names and marks to a file
    	public static void writeMarksToFile(String fileName) 
	{
        	try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) 
		{
            		int numRecords = 3; // Input the number of records
            		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            		for (int i = 0; i < numRecords; i++) 
			{
                		System.out.print("Enter the name of student " + (i + 1) + ": ");
                		String studentName = reader.readLine();
                		System.out.print("Enter the marks for " + studentName + ": ");
                		int studentMarks = Integer.parseInt(reader.readLine());
                		// Write student name and marks to the file
                		writer.println(studentName + ": " + studentMarks);
            		}

            		System.out.println("Student details have been written to " + fileName);
        	} 
		catch (IOException e) 
		{
            		e.printStackTrace();
        	}
    	}
    	// Function to read and print names of students with marks > 70 from the file
    	public static void readMarksFromFile(String fileName) 
	{
        	try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
		{
            		String line;
            		while ((line = reader.readLine()) != null) 
			{
                		String[] parts = line.split(": ");
                		String studentName = parts[0];
                		int studentMarks = Integer.parseInt(parts[1]);

                		if (studentMarks > 70) 
				{
                    			System.out.println(studentName + " has scored more than 70 marks.");
                		}
            		}
        	} 
		catch (IOException e) 
		{
            		e.printStackTrace();
        	}
    	}
}