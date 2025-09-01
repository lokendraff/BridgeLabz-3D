package String_Questions.Level3;

import java.util.Scanner;

public class BMICalculator {
	 public static String[][] calculateBMI(double[][] hw) {
	        String[][] result = new String[hw.length][4];  
	        for (int i = 0; i < hw.length; i++) {
	            double weight = hw[i][0];
	            double heightCm = hw[i][1];
	            double heightM = heightCm / 100.0;
	            double bmi = weight / (heightM * heightM);
	            bmi = Math.round(bmi * 100.0) / 100.0; 
	            String status;
	            if (bmi < 18.5) {
	                status = "Underweight";
	            } else if (bmi < 24.9) {
	                status = "Normal";
	            } else if (bmi < 29.9) {
	                status = "Overweight";
	            } else {
	                status = "Obese";
	            }
	            result[i][0] = String.valueOf(weight);
	            result[i][1] = String.valueOf(heightCm);
	            result[i][2] = String.valueOf(bmi);
	            result[i][3] = status;
	        }
	        return result;
	    }
	    public static void displayReport(String[][] report) {
	        System.out.println(" ");
	        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
	        System.out.println(" ");
	        for (int i = 0; i < report.length; i++) {
	            System.out.printf("%-10s %-10s %-10s %-15s\n", 
	                report[i][0], report[i][1], report[i][2], report[i][3]);
	        }
	        System.out.println(" ");
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[][] hw = new double[10][2]; 
	        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
	            hw[i][0] = sc.nextDouble();
	            System.out.print("Person " + (i + 1) + " - Height (cm): ");
	            hw[i][1] = sc.nextDouble();
	        }
	        String[][] report = calculateBMI(hw);
	        displayReport(report);
}
}

