package String_Questions.Level3;

import java.util.Scanner;

public class FrequencyNestedLoop {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();
	        System.out.println("Character Frequencies:");
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            boolean alreadyCounted = false;
	            for (int k = 0; k < i; k++) {
	                if (text.charAt(k) == ch) {
	                    alreadyCounted = true;
	                    break;
	                }
	            }
	            if (alreadyCounted) continue;
	            int count = 0;
	            for (int j = 0; j < text.length(); j++) {
	                if (text.charAt(j) == ch) {
	                    count++;
	                }
	            }
	            System.out.println(ch + " → " + count);
	        }
	}

}
