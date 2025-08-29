package bestProgrammingPractices_level2;

import java.util.Scanner;

// Program to find side of square using perimeter
class SquareSideCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input perimeter
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}
