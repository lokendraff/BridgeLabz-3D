package arrayslevel2;
import java.util.Scanner;

class LargestDigitsFinder {
    public static void main(String[] args) {
        long number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Note: Number has more than 10 digits. Considering only the first 10.");
                break;
            }
            digits[index] = (int) (number % 10);
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
        
        input.close();
    }
}
