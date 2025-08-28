package arraysAssignment;
import java.util.Scanner;
public class NegativeOrPositve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 5 numbers : ");
		int[] numbers = new int[5];
		for(int i=0; i<5; i++) {
			numbers[i] = sc.nextInt();
			if(numbers[i]<0) {
				System.out.println("Negative");
			}else if(numbers[i]==0) {
				System.out.println("Zero");
			}else {
				if(numbers[i]%2==0) {
					System.out.println("Number is positive and even");
				}else {
					System.out.println("Number is positive and odd");
				}
			}
		}
	}

}
