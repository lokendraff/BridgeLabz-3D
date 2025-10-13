package MultiLevelInheritence_Problems;
class Course {
 String courseName;
 int duration; 

 public Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }

 public void displayCourseInfo() {
     System.out.println("Course: " + courseName);
     System.out.println("Duration: " + duration + " weeks");
 }
}
class OnlineCourse extends Course {
 String platform;
 boolean isRecorded;

 public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }

 @Override
 public void displayCourseInfo() {
     super.displayCourseInfo();
     System.out.println("Platform: " + platform);
     System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
 }
}
class PaidOnlineCourse extends OnlineCourse {
 double fee;
 double discount; 

 public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }
 @Override
 public void displayCourseInfo() {
     super.displayCourseInfo();
     double finalPrice = fee - (fee * discount / 100);
     System.out.println("Course Fee: $" + fee);
     System.out.println("Discount: " + discount + "%");
     System.out.println("Final Price: $" + finalPrice);
 }
}
public class CourseSystem {
 public static void main(String[] args) {
     PaidOnlineCourse poc = new PaidOnlineCourse(
             "Java Programming",
             8,
             "Udemy",
             true,
             200.0,
             20.0
     );
     poc.displayCourseInfo();
 }
}

