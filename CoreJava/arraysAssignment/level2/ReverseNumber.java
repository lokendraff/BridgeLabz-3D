package arrayslevel2;
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        long number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        number = input.nextLong();

        String numberAsString = String.valueOf(number);
        int digitCount = numberAsString.length();
        int[] digits = new int[digitCount];
        int index = 0;
        
        long tempNumber = number;
        while (tempNumber != 0) {
            digits[index] = (int) (tempNumber % 10);
            tempNumber = tempNumber / 10;
            index++;
        }

        System.out.print("The reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        
        input.close();
    }
}
