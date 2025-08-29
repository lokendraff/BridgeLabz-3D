package bestProgrammingPractices_level2;

import java.util.Scanner;

// Creating Class to perform basic arithmetic operations
class BasicCalculatorLevel2 {
    public static void main(String[] args) {
        
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close();
    }
}
