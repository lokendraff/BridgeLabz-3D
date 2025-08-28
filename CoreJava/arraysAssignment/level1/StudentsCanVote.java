package arraysAssignment;
import java.util.Scanner;
public class StudentsCanVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the ages of students : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>=18) {
				System.out.println(arr[i] + " can vote");
			}
		}
		
		
	}

}
