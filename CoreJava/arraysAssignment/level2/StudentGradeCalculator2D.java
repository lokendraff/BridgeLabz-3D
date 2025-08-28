package arrayslevel2;
import java.util.Scanner;

class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // [student_index][0] = Physics, [1] = Chemistry, [2] = Maths
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            System.out.print("Enter Physics marks: ");
            marks[i][0] = input.nextInt();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = input.nextInt();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = input.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Marks cannot be negative. Please enter again.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("  Marks (Phy, Chem, Math): " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2]);
            System.out.printf("  Percentage: %.2f%%\n", percentages[i]);
            System.out.println("  Grade: " + grades[i]);
            System.out.println();
        }

        input.close();
    }
}
