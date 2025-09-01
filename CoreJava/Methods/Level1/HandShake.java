package Methods.Level1;

import java.util.Scanner;

public class HandShake {
	 public static int maxHandshakes(int n) {
	        return (n * (n - 1)) / 2;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of students: ");
	        int n = sc.nextInt();
	        int handshakes = maxHandshakes(n);
	        System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
}
}
