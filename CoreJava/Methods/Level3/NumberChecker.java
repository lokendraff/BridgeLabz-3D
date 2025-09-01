package Methods.Level3;

import java.util.Scanner;

public class NumberChecker {
	 public static String checkSign(int num) {
	        if (num > 0) {
	            return "Positive";
	        } else if (num < 0) {
	            return "Negative";
	        } else {
	            return "Zero";
	        }
	    }
	    public static String checkEvenOdd(int num) {
	        if (num % 2 == 0) {
	            return "Even";
	        } else {
	            return "Odd";
	        }
	    }
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	    public static boolean isPalindrome(int num) {
	        int original = num;
	        int reverse = 0;
	        while (num > 0) {
	            reverse = reverse * 10 + num % 10;
	            num /= 10;
	        }
	        return original == reverse;
	    }
	    public static boolean isArmstrong(int num) {
	        int original = num;
	        int sum = 0;
	        int digits = String.valueOf(num).length();
	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, digits);
	            num /= 10;
	        }
	        return original == sum;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        System.out.println(" Number Analysis ---");
	        System.out.println("Number: " + number);
	        System.out.println("Sign: " + checkSign(number));
	        System.out.println("Even/Odd: " + checkEvenOdd(number));
	        System.out.println("Prime: " + (isPrime(number) ? "Yes" : "No"));
	        System.out.println("Palindrome: " + (isPalindrome(number) ? "Yes" : "No"));
	        System.out.println("Armstrong: " + (isArmstrong(number) ? "Yes" : "No"));

}
}
