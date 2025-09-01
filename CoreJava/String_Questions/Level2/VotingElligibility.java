package String_Questions.Level2;

import java.util.Scanner;

public class VotingElligibility {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] ages = new int[10];
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter age of student " + (i + 1) + ": ");
	            ages[i] = sc.nextInt();
	        }

	        System.out.println("Voting Eligibility Results:");
	        for (int i = 0; i < 10; i++) {
	            if (ages[i] >= 18) {
	                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") → Eligible to vote");
	            } else {
	                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") → Not eligible ");
	            }
	        }
  
	}

}
