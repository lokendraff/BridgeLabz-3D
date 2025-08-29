package bestProgrammingPractices_level1;

import java.util.Scanner;

class ConvertDistanceUserInput {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take distance in kilometers from user
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Conversion factor
        double milesPerKm = 1.6;

        // Convert to miles
        double miles = kilometers / milesPerKm;

        // Display result
        System.out.println("The total miles is " + miles + 
                           " mile for the given " + kilometers + " km");

        input.close();
    }
}
