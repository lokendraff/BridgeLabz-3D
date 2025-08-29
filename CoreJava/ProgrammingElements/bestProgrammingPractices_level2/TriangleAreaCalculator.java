package bestProgrammingPractices_level2;

import java.util.Scanner;

// Program to calculate area of a triangle in square cm and square inches
class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Area formula
        double areaInCm = 0.5 * base * height;

        // 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm
        double areaInInches = areaInCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInInches + " and sq cm is " + areaInCm);

        input.close();
    }
}
