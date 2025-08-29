package bestProgrammingPractices_level2;

import java.util.Scanner;

// Program to convert distance from feet to yards and miles
class DistanceConverterFeetToYardsMiles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}
