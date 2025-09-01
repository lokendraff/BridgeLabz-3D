package String_Questions.Level1;

import java.util.Scanner;

public class LowerCaseComparison {

	  public static String toLowerManual(String str) {
	        String result = "";
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c >= 'A' && c <= 'Z') {
	                c = (char)(c + 32);  
	            }
	            result += c;
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String text = sc.nextLine();
	        String manualLower = toLowerManual(text);
	        String builtInLower = text.toLowerCase();
	        System.out.println("Manual Lowercase   : " + manualLower);
	        System.out.println("Built-in Lowercase : " + builtInLower);
	        if (manualLower.equals(builtInLower)) {
	            System.out.println(" Both results are equal.");
	        } else {
	            System.out.println(" Results are NOT equal.");
	        }
	}

}
