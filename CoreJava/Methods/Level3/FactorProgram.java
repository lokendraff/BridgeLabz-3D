package Methods.Level3;

import java.util.Scanner;
import java.util.*;
public class FactorProgram {
	public static int[] findFactors(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        int[] factors = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            factors[i] = list.get(i);
        }
        return factors;
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f * f;
        }
        return sum;
    }
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.print("Factors of " + num + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("Sum of factors = " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors = " + sumOfSquares(factors));
        System.out.println("Product of factors = " + productOfFactors(factors));

}
}