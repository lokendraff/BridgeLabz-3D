package Methods.Level1;

import java.util.Scanner;

public class TriangularRun {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter side a (m): ");
	        double a = sc.nextDouble();
	        System.out.print("Enter side b (m): ");
	        double b = sc.nextDouble();
	        System.out.print("Enter side c (m): ");
	        double c = sc.nextDouble();
	        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
	            double perimeter = a + b + c; 
	            double target = 5000.0;
	            long rounds = (long) Math.ceil(target / perimeter);
	            System.out.println("Perimeter of the triangular track: " + perimeter + " meters");
	            System.out.println("To complete 5 km, the athlete must run " + rounds + " round(s).");
	        } else {
	            System.out.println("Invalid triangle sides. Please enter valid positive values.");
	        }
	}

}
