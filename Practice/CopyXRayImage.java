import java.io.*;
import java.nio.ByteBuffer;

public class CopyXRayImage {
    public static void main(String[] args) {
        // Replace "sourceFileName" and "destinationDirectory" with actual file paths
        String sourceFileName = "2023-11-15_09-15-56.snagproj";
        String destinationDirectory = "desktop";

        try {
            // Open the source file for reading
            FileInputStream sourceFileInputStream = new FileInputStream(sourceFileName);

            // Read the patient number (4 bytes)
            byte[] patientNumberBytes = new byte[4];
            int bytesRead = sourceFileInputStream.read(patientNumberBytes);

            if (bytesRead != 4) {
                System.out.println("Error: Unable to read patient number from the source file.");
                sourceFileInputStream.close();
                return;
            }

            // Convert the patient number bytes to an integer
            int patientNumber = ByteBuffer.wrap(patientNumberBytes).getInt();
            System.out.println("Patient Number: " + patientNumber);

            // Construct the destination file name
            String destinationFileName = destinationDirectory + "/Patient" + patientNumber + ".xray";

            // Open the destination file for writing
            FileOutputStream destinationFileOutputStream = new FileOutputStream(destinationFileName);

            // Read and write the remaining content
            int data;
            while ((data = sourceFileInputStream.read()) != -1) {
                destinationFileOutputStream.write(data);
            }

            // Close the streams
            sourceFileInputStream.close();
            destinationFileOutputStream.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}