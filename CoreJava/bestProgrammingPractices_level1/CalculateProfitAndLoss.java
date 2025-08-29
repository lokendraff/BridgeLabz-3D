package bestProgrammingPractices_level1;

class CalculateProfitAndLoss {

    public static void main(String[] args) {

        // Cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit
        double profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercent = (profit / costPrice) * 100;

        // Display result using single print
        System.out.println("The Cost Price is INR " + costPrice + 
                           " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + 
                           " and the Profit Percentage is " + profitPercent);
    }
}
