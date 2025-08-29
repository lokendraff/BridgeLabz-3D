package bestProgrammingPractices_level1;

import java.util.Scanner;

class CalculateTriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take base and height from user
        System.out.print("Enter base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Area formula
        double areaCm2 = 0.5 * base * height;

        // Convert to inches (1 inch = 2.54 cm → 1 sq inch = 2.54^2 sq cm)
        double areaInches2 = areaCm2 / (2.54 * 2.54);

        // Display result
        System.out.println("The area of triangle is " + areaCm2 + " sq cm and " + 
                           areaInches2 + " sq inches");

        input.close();
    }
}
