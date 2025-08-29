package bestProgrammingPractices_level1;

import java.util.Scanner;

class ConvertFeetToYardsMiles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // Conversion factors
        double yards = feet / 3;
        double miles = yards / 1760;

        // Display result
        System.out.println("The distance in feet is " + feet +
                           " which is " + yards + " yards and " + miles + " miles");

        input.close();
    }
}
