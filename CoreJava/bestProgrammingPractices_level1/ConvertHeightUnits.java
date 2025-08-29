package bestProgrammingPractices_level1;

import java.util.Scanner;

class ConvertHeightUnits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion
        double inches = heightCm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        // Display result
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + remainingInches);

        input.close();
    }
}
