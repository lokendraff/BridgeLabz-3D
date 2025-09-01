package Methods.Level3;

import java.util.Scanner;

public class FootballTeam {
	public static double findShortest(double[] heights) {
        double min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }
        return min;
    }
    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }
    public static double findMean(double[] heights) {
        double sum = 0;
        for (double h : heights) {
            sum += h;
        }
        return sum / heights.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players in the team: ");
        int n = sc.nextInt();
        double[] heights = new double[n];
        System.out.println("Enter the heights of players in centimeters:");
        for (int i = 0; i < n; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double shortest = findShortest(heights);
        double tallest = findTallest(heights);
        double mean = findMean(heights);
        System.out.println(" Team Height Analysis ---");
        System.out.println("Shortest Height : " + shortest + " cm");
        System.out.println("Tallest Height  : " + tallest + " cm");
        System.out.println("Mean Height     : " + mean + " cm");

}
}
