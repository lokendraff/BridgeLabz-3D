package String_Questions.Level3;
import java.util.*;
public class CalendarDisplay {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        System.out.print("Enter month (1-12): ");
	        int month = sc.nextInt();
	        System.out.print("Enter year: ");
	        int year = sc.nextInt();
	        month = month - 1;
	        Calendar cal = new GregorianCalendar(year, month, 1);
	        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	        int startDay = cal.get(Calendar.DAY_OF_WEEK); 
	        System.out.println("\n   Calendar for " + (month + 1) + "/" + year);
	        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	        for (int i = 1; i < startDay; i++) {
	            System.out.print("    ");
	        }
	        for (int day = 1; day <= daysInMonth; day++) {
	            System.out.printf("%3d ", day);
	            if ((day + startDay - 1) % 7 == 0) {
	                System.out.println();
	            }
	        }
	}

}
