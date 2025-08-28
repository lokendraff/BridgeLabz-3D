package arrays;
import java.util.Scanner;
class ArrayInputAndSum {

    public static void main(String[] args) {

        double[] userNumbers = new double[10];
        double totalSum = 0.0;
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive numbers to add to the array (up to 10).");
        System.out.println("Enter 0 or a negative number to stop.");
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double currentNumber = input.nextDouble();
            if (currentNumber <= 0) {
                break;
            }
            userNumbers[index] = currentNumber;
            index++;
            if (index == 10) {
                System.out.println("Array is full. No more numbers can be added.");
                break;
            }
        }

        System.out.println("\nThe numbers you entered are : ");
        for (int i = 0; i < index; i++) {
            System.out.print(userNumbers[i] + "  ");
            totalSum += userNumbers[i];
        }
        System.out.println("\n\nThe sum of all the numbers is: " + totalSum);
        input.close();
    }
}