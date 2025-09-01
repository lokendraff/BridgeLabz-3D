package Methods.Level3;

import java.util.Scanner;

public class PercentageCalculator {
	public static int calculateTotal(int physics, int chemistry, int maths) {
        return physics + chemistry + maths;
    }
    public static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }
    public static double calculatePercentage(int total, int maxMarks) {
        return ((double) total / maxMarks) * 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();
        int total = calculateTotal(physics, chemistry, maths);
        double average = calculateAverage(total, 3);
        double percentage = calculatePercentage(total, 300);
        System.out.println(" Student Result");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

}
}
