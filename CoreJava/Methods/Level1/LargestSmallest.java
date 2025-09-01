package Methods.Level1;

import java.util.Scanner;

public class LargestSmallest {
	public static int findSmallest(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }
    public static int findLargest(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int smallest = findSmallest(num1, num2, num3);
        int largest = findLargest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

}
}
