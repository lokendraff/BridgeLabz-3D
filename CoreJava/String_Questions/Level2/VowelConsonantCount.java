package String_Questions.Level2;

import java.util.Scanner;

public class VowelConsonantCount {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = sc.nextLine().toLowerCase();  
	        int vowels = 0, consonants = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (c >= 'a' && c <= 'z') {  
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }
	        System.out.println("Vowels count     : " + vowels);
	        System.out.println("Consonants count : " + consonants);
	}

}
