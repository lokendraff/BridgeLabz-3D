package bestProgrammingPractices_level2;

import java.util.Scanner;

// Program to demonstrate double operations
class DoubleOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input double values
        System.out.print("Enter double a: ");
        double a = input.nextDouble();

        System.out.print("Enter double b: ");
        double b = input.nextDouble();

        System.out.print("Enter double c: ");
        double c = input.nextDouble();

        // Perform operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Output
        System.out.println("The results of Double Operations are " 
                           + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
