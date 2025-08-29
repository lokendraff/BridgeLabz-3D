package bestProgrammingPractices_level1;

import java.util.Scanner;

class CalculateTotalPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take unit price and quantity
        System.out.print("Enter the unit price of item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}
