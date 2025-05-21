// Import the libraries
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**.
* This is the main class for the student class program
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-15
*/

// Define the main class
public class Main {
    // Declare the main method
    public static void main(final String[] args) throws IOException {
        // Make list of students
        ArrayList<Student> listOfStudents = new ArrayList<>();

        // Scan input file
        File inputFile = new File("input.txt");
        Scanner scanner = new Scanner(inputFile);

        // Initialize counter
        int counter = 0;

        // Read the file until the end
        while (scanner.hasNextLine()) {
            // Increment counter
            counter++;

            // Read the line
            String line = scanner.nextLine();

            // Create parts array split by spaces
            String[] parts = line.split(" ");

            // Create student instance with nothing
            Student student;

            // Check if there is a middle initial
            if (parts.length == 5) {
                // Add parts to new student instance
                student = new Student(parts[0], parts[1], parts[2],
                         parts[3], parts[4]);

                // Add student to list
                listOfStudents.add(student);

                // Print data to console
                student.printData();

                // Print new line
                System.out.println();

            // Otherwise no middle initial
            } else {
                // Add line to new student instance without middle initial
                student = new Student(parts[0], parts[1], parts[2], parts[3]);

                // Add student to list
                listOfStudents.add(student);

                // Print data to console
                student.printData();

                // Print new line
                System.out.println();
            }
        }

        // Prepare writer for output file
        FileWriter myWriter = new FileWriter("output.txt");

        // Write the number of students to the file
        myWriter.write("There are " + counter + " students in the file.\n");

        // Close writer
        myWriter.close();

        // Print success message
        System.out.println();
        System.out.println("Successfully wrote to the file.");

        // Close the scanner
        scanner.close();
    }
}
