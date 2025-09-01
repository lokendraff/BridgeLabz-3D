package String_Questions.Level1;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();
	        System.out.print("Enter start index: ");
	        int start = sc.nextInt();
	        System.out.print("Enter end index: ");
	        int end = sc.nextInt();
	        String manualSubstring = "";
	        for (int i = start; i < end && i < text.length(); i++) {
	            manualSubstring += text.charAt(i);
	        }
	        String builtInSubstring = "";
	        if (start >= 0 && end <= text.length() && start < end) {
	            builtInSubstring = text.substring(start, end);
	        }
	        System.out.println("Original String      : " + text);
	        System.out.println("Manual Substring     : " + manualSubstring);
	        System.out.println("Built-in Substring   : " + builtInSubstring);
	        if (manualSubstring.equals(builtInSubstring)) {
	            System.out.println(" Both substrings are equal.");
	        } else {
	            System.out.println(" Substrings are NOT equal.");
	        }
	}

}
