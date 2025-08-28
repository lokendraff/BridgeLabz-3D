package arrayslevel2;
import java.util.Scanner;

class ZaraBonusCalculator {
    public static void main(String[] args) {
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter details for 10 employees of Zara:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            double salary = input.nextDouble();
            System.out.print("Enter years of service: ");
            double years = input.nextDouble();

            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Salary and years cannot be negative. Please enter again.");
                i--; 
                continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nCompany Payout Details : ");
        System.out.println("Total Bonus Payout by Zara: INR " + totalBonus);
        System.out.println("Total Old Salary Payout: INR " + totalOldSalary);
        System.out.println("Total New Salary Payout (including bonus): INR " + totalNewSalary);
        
        input.close();
    }
}