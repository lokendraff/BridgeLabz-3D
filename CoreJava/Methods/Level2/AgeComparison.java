package Methods.Level2;

import java.util.Scanner;

public class AgeComparison {
	public static String findYoungest(int ageAmar, int ageAkbar, int ageAnthony) {
		if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
			return "Amar";
		} else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
			return "Akbar";
		} else {
			return "Anthony";
		}
	}

	public static String findTallest(double heightAmar, double heightAkbar, double heightAnthony) {
		if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
			return "Amar";
		} else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
			return "Akbar";
		} else {
			return "Anthony";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amar's age: ");
		int ageAmar = sc.nextInt();
		System.out.print("Enter Akbar's age: ");
		int ageAkbar = sc.nextInt();
		System.out.print("Enter Anthony's age: ");
		int ageAnthony = sc.nextInt();
		System.out.print("Enter Amar's height (in cm): ");
		double heightAmar = sc.nextDouble();
		System.out.print("Enter Akbar's height (in cm): ");
		double heightAkbar = sc.nextDouble();
		System.out.print("Enter Anthony's height (in cm): ");
		double heightAnthony = sc.nextDouble();
		String youngest = findYoungest(ageAmar, ageAkbar, ageAnthony);
		String tallest = findTallest(heightAmar, heightAkbar, heightAnthony);
		System.out.println("Results:");
		System.out.println("The youngest friend is: " + youngest);
		System.out.println("The tallest friend is: " + tallest);
	}
}
