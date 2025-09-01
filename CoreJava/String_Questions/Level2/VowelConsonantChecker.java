package String_Questions.Level2;

import java.util.Scanner;

public class VowelConsonantChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) { 
                char lower = Character.toLowerCase(c);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    System.out.println(c + "  Vowel");
                } else {
                    System.out.println(c + "  Consonant");
                }
            } else {
                System.out.println(c + "  Not a Letter");
            }
        }

	}

}
