package bestProgrammingPractices_level1;

import java.util.Scanner;

class CalculateDiscountUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take fee from user
        System.out.print("Enter the fee amount: ");
        double fee = input.nextDouble();

        // Take discount percent from user
        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();

        // Calculate discount
        double discountAmount = (fee * discountPercent) / 100;

        // Final fee
        double finalFee = fee - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
