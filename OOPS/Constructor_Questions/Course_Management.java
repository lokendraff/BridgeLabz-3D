package Constructor_Questions;
class Course {
 String courseName;
 int duration; 
 double fee;
 static String instituteName = "GLA UNIVERSITY";
 public Course(String courseName, int duration, double fee) {
     this.courseName = courseName;
     this.duration = duration;
     this.fee = fee;
 }
 public void displayCourseDetails() {
     System.out.println("Institute: " + instituteName + 
                        ", Course: " + courseName + 
                        ", Duration: " + duration + " months" + 
                        ", Fee: " + fee);
 }
 public static void updateInstituteName(String newName) {
     instituteName = newName;
     System.out.println("Institute name updated to: " + instituteName);
 }
}
public class Course_Management {
 public static void main(String[] args) {
     Course c1 = new Course("Java Programming", 6, 15000);
     Course c2 = new Course("Web Development", 4, 12000);
     c1.displayCourseDetails();
     c2.displayCourseDetails();
     Course.updateInstituteName("BridgeLab");
     c1.displayCourseDetails();
     c2.displayCourseDetails();
 }
}

