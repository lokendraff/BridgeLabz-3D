package String_Questions.Level1;

import java.util.Scanner;

public class ReturnStringInUserDefinedMethod {
	 public static char[] getChars(String str) {
	        char[] arr = new char[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            arr[i] = str.charAt(i);
	        }
	        return arr;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();
	        char[] userArr = getChars(text);
	        char[] builtInArr = text.toCharArray();
	        System.out.println("User-defined : " + new String(userArr));
	        System.out.println("Built-in     : " + new String(builtInArr));
	        if (new String(userArr).equals(new String(builtInArr)))
	            System.out.println("Both are equal.");
	        else
	            System.out.println(" Not equal.");

	}

}
