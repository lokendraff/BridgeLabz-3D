package bestProgrammingPractices_level1;

import java.util.Scanner;

class CalculateSquareSide {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Side calculation
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        input.close();
    }
}
