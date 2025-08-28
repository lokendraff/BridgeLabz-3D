package arrays;
import java.util.Scanner;

class FizzBuzzGenerator {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer for the FizzBuzz game: ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Error: Please enter a positive integer.");
            input.close();
            return;
        }

        String[] fizzBuzzResults = new String[number + 1];

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzResults[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzResults[i] = "Buzz";
            } else {
                fizzBuzzResults[i] = String.valueOf(i);
            }
        }

        System.out.println("\n--- FizzBuzz Results ---");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
        }
        
        input.close();
    }
}