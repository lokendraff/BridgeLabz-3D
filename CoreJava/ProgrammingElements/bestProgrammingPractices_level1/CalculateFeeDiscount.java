package bestProgrammingPractices_level1;

class CalculateFeeDiscount {

    public static void main(String[] args) {

        // Fee and discount percent
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount
        double discountAmount = (fee * discountPercent) / 100;

        // Final fee after discount
        double finalFee = fee - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
