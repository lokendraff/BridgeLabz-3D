package String_Questions.Level2;

import java.util.Scanner;

public class WordIn2DArray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String text = sc.nextLine();
	        String[] words = text.split(" ");
	        String[][] wordData = new String[words.length][2];
	        for (int i = 0; i < words.length; i++) {
	            wordData[i][0] = words[i]; 
	            wordData[i][1] = String.valueOf(words[i].length());
	        }
	        System.out.println("Words and their lengths:");
	        for (int i = 0; i < wordData.length; i++) {
	            System.out.println(wordData[i][0] + " -> " + wordData[i][1]);
	        }
	}

}
