package Methods.Level3;
import java.util.*;
public class CalendarDisplay {
	 public static void printCalendar(int month, int year) {
	        Calendar cal = new GregorianCalendar(year, month - 1, 1);
	        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	        int startDay = cal.get(Calendar.DAY_OF_WEEK); 
	        System.out.println("    Calendar for " + month + "/" + year);
	        System.out.println("Su Mo Tu We Th Fr Sa");
	        for (int i = 1; i < startDay; i++) {
	            System.out.print("   ");
	        }
	        for (int day = 1; day <= daysInMonth; day++) {
	            System.out.printf("%2d ", day);
	            if ((day + startDay - 1) % 7 == 0) {
	                System.out.println();
	            }
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter month (1-12): ");
	        int month = sc.nextInt();
	        System.out.print("Enter year: ");
	        int year = sc.nextInt();
	        printCalendar(month, year);

}
}
