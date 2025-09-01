package Methods.Level2;
import java.util.*;
public class FactorCalculator {
	public static int[] findFactors(int n) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsList.add(i);
            }
        }
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
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
        int sumSq = 0;
        for (int f : factors) {
            sumSq += f * f;
        }
        return sumSq;
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
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors of " + n + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));

}
}
