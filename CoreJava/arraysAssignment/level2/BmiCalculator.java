package arrayslevel2;
import java.util.Scanner;

class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int numberOfPersons = input.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Enter weight in kg: ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height in meters: ");
            heights[i] = input.nextDouble();
        }

        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report of the Team ---");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s | %-15s | %-15s | %-15s\n", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f | %-15.2f | %-15.2f | %-15s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }
        System.out.println("-----------------------------------------------------------------");

        input.close();
    }
}
