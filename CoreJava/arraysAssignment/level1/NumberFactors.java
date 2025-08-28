package arrays;
import java.util.Scanner;

class NumberFactors {
    public static void main(String[] args) {
        int number;
        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int index = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactors) {
                    int[] tempArray = new int[maxFactors * 2];
                    for(int j = 0; j < maxFactors; j++) {
                        tempArray[j] = factors[j];
                    }
                    factors = tempArray;
                    maxFactors *= 2;
                }
                factors[index] = i;
                index++;
            }
        }

        System.out.print("\nThe factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}