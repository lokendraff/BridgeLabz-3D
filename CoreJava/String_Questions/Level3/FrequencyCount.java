package String_Questions.Level3;

import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        boolean visited[] = new boolean[text.length()]; 
        System.out.println("Character Frequencies:");
        for (int i = 0; i < text.length(); i++) {
            if (visited[i]) continue;  
            char ch = text.charAt(i);
            int count = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                    visited[j] = true;  
                }
            }
            System.out.println(ch + " → " + count);
	}

}
