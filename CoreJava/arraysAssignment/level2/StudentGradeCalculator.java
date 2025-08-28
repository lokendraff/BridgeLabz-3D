package arrayslevel2;
import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            System.out.print("Enter Physics marks: ");
            int pMarks = input.nextInt();
            System.out.print("Enter Chemistry marks: ");
            int cMarks = input.nextInt();
            System.out.print("Enter Maths marks: ");
            int mMarks = input.nextInt();

            if (pMarks < 0 || cMarks < 0 || mMarks < 0) {
                System.out.println("Invalid marks. Marks cannot be negative. Please enter again.");
                i--; 
                continue;
            }
            physicsMarks[i] = pMarks;
            chemistryMarks[i] = cMarks;
            mathsMarks[i] = mMarks;
        }

        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (double) totalMarks / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\n--- Student Grade Report ---");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + physicsMarks[i]);
            System.out.println("  Chemistry: " + chemistryMarks[i]);
            System.out.println("  Maths: " + mathsMarks[i]);
            System.out.printf("  Percentage: %.2f%%\n", percentages[i]);
            System.out.println("  Grade: " + grades[i]);
            System.out.println();

        input.close();
    }
}
}
