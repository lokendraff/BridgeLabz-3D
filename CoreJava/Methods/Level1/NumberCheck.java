package Methods.Level1;

import java.util.Scanner;

public class NumberCheck {
	 public static void checkNumber(int num) {
	        if (num > 0) {
	            System.out.println(num + " is Positive.");
	        } else if (num < 0) {
	            System.out.println(num + " is Negative.");
	        } else {
	            System.out.println("The number is Zero.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        checkNumber(num);

}
}
