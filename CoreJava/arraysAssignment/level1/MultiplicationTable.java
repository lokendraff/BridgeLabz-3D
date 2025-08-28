package arrays;
import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        int number; 
        int[] multiplicationResult = new int[4]; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see its multiplication table (from 6 to 9): ");
        number = input.nextInt();
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            multiplicationResult[j] = number * i;
        }

        System.out.println("\nMultiplication Table for " + number + " : ");
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[j]);
        }
        
        input.close();
    }
}