package String_Questions.Level2;

import java.util.Scanner;

public class StringLength {
	 public static int findLength(String str) {
	        char[] chars = str.toCharArray();  
	        int count = 0;
	        for (char c : chars) {
	            count++;  
	        }
	        return count;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();
	        int length = findLength(text);
	        System.out.println("Length of the string: " + length);
	}

}
