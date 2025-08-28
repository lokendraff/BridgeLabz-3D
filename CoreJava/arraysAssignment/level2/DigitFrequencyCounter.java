package arrayslevel2;
import java.util.Scanner;

class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        long tempNumber = number;
        if (tempNumber < 0) {
            tempNumber = -tempNumber; // Make number positive for processing
        }

        String numberStr = String.valueOf(tempNumber);
        int digitCount = numberStr.length();
        int[] digits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber /= 10;
        }

        int[] frequency = new int[10]; // To store frequency of digits 0-9

        for (int i = 0; i < digitCount; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        System.out.println("\n--- Digit Frequency Report for " + number + " ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + " = " + frequency[i]);
            }
        }

        input.close();
    }
}

