package String_Questions.Level1;

import java.util.Scanner;

public class UpperCaseComparison {
	public static String toUpperManual(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);  
            }
            result += c;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String manualUpper = toUpperManual(text);
        String builtInUpper = text.toUpperCase();
        System.out.println("Manual Uppercase   : " + manualUpper);
        System.out.println("Built-in Uppercase : " + builtInUpper);
        if (manualUpper.equals(builtInUpper)) {
            System.out.println(" Both results are equal.");
        } else {
            System.out.println("Results are NOT equal.");
        }
    }
}
