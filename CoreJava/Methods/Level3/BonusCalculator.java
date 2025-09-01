package Methods.Level3;

import java.util.Scanner;

public class BonusCalculator {
	public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService > 10) {
            return salary * 0.10; 
        } else if (yearsOfService >= 5) {
            return salary * 0.05;  
        } else {
            return salary * 0.02;  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBonus = 0;
        System.out.println(" Zara Company Bonus Calculation ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Employee " + i);
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            int years = sc.nextInt();
            double bonus = calculateBonus(salary, years);
            double newSalary = salary + bonus;
            totalBonus += bonus;
            System.out.println("Old Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
        }
        System.out.println("\nTotal Bonus Zara Company has to pay: " + totalBonus);
}
}
