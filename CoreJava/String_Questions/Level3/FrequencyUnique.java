package String_Questions.Level3;

import java.util.Scanner;

public class FrequencyUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String unique = ""; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique += ch;
            }
        }
        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < unique.length(); i++) {
            char ch = unique.charAt(i);
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
