package Methods.Level2;

import java.util.Scanner;

public class QuadraticEquation {
	public static void findRoots(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        } else {
            System.out.println("The equation has no real roots (discriminant < 0).");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
        } else {
            findRoots(a, b, c);
        }

}
}
