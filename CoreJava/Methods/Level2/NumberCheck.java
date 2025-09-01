package Methods.Level2;

import java.util.Scanner;

public class NumberCheck {
	public static void checkNumber(int num) {
		if (num >= 0) {
			System.out.print(num + " is Positive");
			if (num % 2 == 0) {
				System.out.println(" and Even.");
			} else {
				System.out.println(" and Odd.");
			}
		} else {
			System.out.println(num + " is Negative.");
		}
	}

	public static void compareFirstAndLast(int[] arr) {
		int first = arr[0];
		int last = arr[arr.length - 1];
		System.out.print("\nComparison of first and last elements: ");
		if (first == last) {
			System.out.println("Both are Equal.");
		} else if (first > last) {
			System.out.println("First element (" + first + ") is Greater than last element (" + last + ").");
		} else {
			System.out.println("First element (" + first + ") is Less than last element (" + last + ").");
		}
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("\nChecking numbers:");
        for (int num : numbers) {
            checkNumber(num);
        }
        compareFirstAndLast(numbers);

}
}
