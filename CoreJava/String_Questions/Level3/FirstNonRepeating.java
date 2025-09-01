package String_Questions.Level3;

import java.util.Scanner;

public class FirstNonRepeating {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();
	        char result = 0;  
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            boolean repeated = false;
	            for (int j = 0; j < text.length(); j++) {
	                if (i != j && text.charAt(j) == ch) {
	                    repeated = true;
	                    break;
	                }
	            }
	            if (!repeated) {  
	                result = ch;
	                break;
	            }
	        }
	        if (result != 0) {
	            System.out.println("First non-repeating character: " + result);
	        } else {
	            System.out.println("No non-repeating character found.");
	        }
	}

}
