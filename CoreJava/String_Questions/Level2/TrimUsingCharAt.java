package String_Questions.Level2;

import java.util.Scanner;

public class TrimUsingCharAt {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string with spaces: ");
	        String s = sc.nextLine();
	        int start = 0;
	        int end = s.length() - 1;
	        while (start <= end && s.charAt(start) == ' ') {
	            start++;
	        }
	        while (end >= start && s.charAt(end) == ' ') {
	            end--;
	        }
	        String trimmed = "";
	        for (int i = start; i <= end; i++) {
	            trimmed += s.charAt(i);
	        }
	        System.out.println("Original String: [" + s + "]");
	        System.out.println("Trimmed String : [" + trimmed + "]");
	}

}
