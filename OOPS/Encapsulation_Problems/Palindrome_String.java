package Encapsulation_Problems;
public class Palindrome_String {
	String text;
	Palindrome_String(String text) {
		this.text=text;	
	}
	public boolean isPalindrome() {
	String cleantext=text.replaceAll("\\s","").toLowerCase();
	String reverseText=new StringBuilder(cleantext).reverse().toString();
	return cleantext.equals(reverseText);
	}
	
	public void diplayResult() {
		if(isPalindrome()) {
			System.out.println(text+" is palindrome");
			}
		else {
			System.out.println(text+" is not Palindrome");
		}
	}
	public static void main(String[] args) {
		 Palindrome_String checker1 = new Palindrome_String("Lion lives in forest");
		 checker1.diplayResult();
		 Palindrome_String checker2 = new Palindrome_String("Suraj");
		 checker2.diplayResult();
	}
}
