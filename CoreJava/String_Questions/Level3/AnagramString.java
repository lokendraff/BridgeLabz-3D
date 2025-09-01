package String_Questions.Level3;
import java.util.*;
public class AnagramString {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first text: ");
	        String text1 = sc.nextLine();
	        System.out.print("Enter second text: ");
	        String text2 = sc.nextLine();
	        text1 = text1.replaceAll("\\s", "").toLowerCase();
	        text2 = text2.replaceAll("\\s", "").toLowerCase();
	        boolean isAnagram = false;
	        if (text1.length() == text2.length()) {
	            char[] arr1 = text1.toCharArray();
	            char[] arr2 = text2.toCharArray();
	            Arrays.sort(arr1);
	            Arrays.sort(arr2);
	            isAnagram = Arrays.equals(arr1, arr2);
	        }
	        if (isAnagram) {
	            System.out.println("The texts are Anagrams.");
	        } else {
	            System.out.println("The texts are NOT Anagrams.");
	        }
	}

}
