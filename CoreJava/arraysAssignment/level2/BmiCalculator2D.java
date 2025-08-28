package arrayslevel2;
import java.util.Scanner;

class BmiCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();
            System.out.print("Enter height in meters: ");
            double height = input.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Weight and height must be positive. Please enter again.");
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < numberOfPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.printf("  Height: %.2f m\n", personData[i][1]);
            System.out.printf("  Weight: %.2f kg\n", personData[i][0]);
            System.out.printf("  BMI: %.2f\n", personData[i][2]);
            System.out.println("  Status: " + weightStatus[i]);
            System.out.println();
        }

        input.close();
    }
}
