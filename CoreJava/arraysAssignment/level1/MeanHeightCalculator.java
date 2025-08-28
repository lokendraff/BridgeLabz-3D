package arrays;
import java.util.Scanner;
class MeanHeightCalculator {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sumOfHeights = 0.0;
        double meanHeight;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the heights of the 11 players in the team:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }
        for (int i = 0; i < heights.length; i++) {
            sumOfHeights += heights[i];
        }
        meanHeight = sumOfHeights / 11;
        System.out.println("\nThe mean height of the football team is: " + meanHeight);
        
        input.close();
    }
}
