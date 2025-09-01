package String_Questions.Level2;

import java.util.Scanner;

public class SplitComparison {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String text = sc.nextLine();
	        String word = "";
	        String[] manualWords = new String[text.length()]; 
	        int count = 0;
	        for (int i = 0; i < text.length(); i++) {
	            char c = text.charAt(i);
	            if (c != ' ') {
	                word += c;
	            } else {
	                if (!word.isEmpty()) {
	                    manualWords[count++] = word;
	                    word = "";
	                }
	            }
	        }
	        if (!word.isEmpty()) {
	            manualWords[count++] = word;
	        }
	        String[] builtInWords = text.split(" ");
	        System.out.print("\nManual Split   : ");
	        for (int i = 0; i < count; i++) {
	            System.out.print("[" + manualWords[i] + "] ");
	        }
	        System.out.print("Built-in Split : ");
	        for (String w : builtInWords) {
	            System.out.print("[" + w + "] ");
	        }
	}

}
