package String_Questions.Level2;

import java.util.Scanner;

public class ShortestLongestWord {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String text = sc.nextLine();
	        String[] words = text.split(" ");
	        String shortest = words[0];
	        String longest = words[0];
	        for (String word : words) {
	            if (word.length() < shortest.length()) {
	                shortest = word;
	            }
	            if (word.length() > longest.length()) {
	                longest = word;
	            }
	        }
	        System.out.println("\nShortest word: " + shortest + " (length " + shortest.length() + ")");
	        System.out.println("Longest word : " + longest + " (length " + longest.length() + ")");
	}

}
