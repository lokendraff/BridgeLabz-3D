package bestProgrammingPractices_level1;

import java.util.Scanner;

class CalculateMaxHandshakes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula for handshakes = (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of handshakes among " +
                           numberOfStudents + " students is " + maxHandshakes);

        input.close();
    }
}
