package Methods.Level2;

import java.util.Scanner;

public class NaturalNumberSumRecursion {
	public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;  
        }
        return n + recursiveSum(n - 1); 
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Sum using recursive method: " + sumRecursive);
        System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations are correct and match!");
        } else {
            System.out.println(" The results do not match!");

}
    }
}
