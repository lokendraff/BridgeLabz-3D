package arrayslevel2;
import java.util.Scanner;

class DynamicLargestDigitsFinder {
    public static void main(String[] args) {
        long number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        if (number == 0) {
            digits[index] = 0;
            index++;
        }

        long tempNumber = number;
        while (tempNumber != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray;
            }
            digits[index] = (int) (tempNumber % 10);
            tempNumber = tempNumber / 10;
            index++;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                largest = digits[i];
            }
        }
        for (int i = 0; i < index; i++) {
            if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("The largest digit is: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("The second largest digit is: " + secondLargest);
        }
        
        input.close();
    }
}
