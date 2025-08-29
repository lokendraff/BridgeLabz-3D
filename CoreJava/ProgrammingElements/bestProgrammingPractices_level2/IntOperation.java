package bestProgrammingPractices_level2;

import java.util.Scanner;

// Program to demonstrate integer operations
class IntOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input integers
        System.out.print("Enter integer a: ");
        int a = input.nextInt();

        System.out.print("Enter integer b: ");
        int b = input.nextInt();

        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        // Perform operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output
        System.out.println("The results of Int Operations are " 
                           + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
