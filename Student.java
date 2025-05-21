/**.
* This is the student class for the student class program
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-15
*/

// Define the student class
public class Student {
    // Declare attributes
    String name;
    String lastName;
    String midInitial;
    String grade;
    String iep;

    /**
    * This is the constructor for a student with a middle initial.
    *
    * @param name name of the student
    * @param lastName last name of the student
    * @param midInitial middle initial of the student
    * @param grade grade of the student
    * @param iep true if the student has an IEP, false otherwise
    */

    // Constructor for a student with a middle initial
    public Student(final String name, final String midInitial,
            final String lastName, final String grade, final String iep) {
        // Assign attributes to this instance
        this.name = name;
        this.midInitial = midInitial;
        this.lastName = lastName;
        this.grade = grade;
        this.iep = iep;
    }

    /**
    * This is the constructor for a student without a middle initial.
    *
    * @param name name of the student
    * @param lastName last name of the student
    * @param grade grade of the student
    * @param iep true if the student has an IEP, false otherwise
    */

    // Constructor for a student without a middle initial
    public Student(final String name, final String lastName,
        final String grade, final String iep) {
        // Assign attributes to this instance
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
        this.iep = iep;
    }

    /**
    * This method prints the student information.
    */

    public void printData() {
        // Print the student information
        System.out.println("Name: " + this.name);
        System.out.println("Middle Initial: " + this.midInitial);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Grade: " + this.grade);
        System.out.println("IEP: " + this.iep);
    }
}
