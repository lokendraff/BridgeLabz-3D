package Methods.Level1;

import java.util.Scanner;

public class ChocolateDistribution {
	 public static void distributeChocolates(int chocolates, int children) {
	        if (children == 0) {
	            System.out.println("Cannot divide chocolates among 0 children!");
	            return;
	        }
	        int eachChild = chocolates / children;   
	        int remaining = chocolates % children;   
	        System.out.println("Each child will get " + eachChild + " chocolates.");
	        System.out.println("Remaining chocolates: " + remaining);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter total number of chocolates: ");
	        int chocolates = sc.nextInt();
	        System.out.print("Enter number of children: ");
	        int children = sc.nextInt();
	        distributeChocolates(chocolates, children);

}
}
