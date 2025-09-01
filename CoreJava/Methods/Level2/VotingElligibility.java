package Methods.Level2;

import java.util.Scanner;

public class VotingElligibility {
	 public static boolean canVote(int age) {
	        return age >= 18;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] ages = new int[10];
	        System.out.println("Enter the ages of 10 students:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Age of student " + (i + 1) + ": ");
	            ages[i] = sc.nextInt();
	        }
	        System.out.println("\nVoting Eligibility Results:");
	        for (int i = 0; i < 10; i++) {
	            if (canVote(ages[i])) {
	                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Eligible to vote ✅");
	            } else {
	                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Not eligible to vote ❌");
	            }
	        }

}
}
