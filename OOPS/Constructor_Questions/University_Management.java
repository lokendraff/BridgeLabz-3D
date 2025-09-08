package Constructor_Questions;
class Student {
 public int rollNumber;     
 protected String name;       
 private double CGPA;
 public Student(int rollNumber, String name, double CGPA) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.CGPA = CGPA;
 }
 public double getCGPA() {
     return CGPA;
 }
 public void setCGPA(double CGPA) {
     if (CGPA >= 0.0 && CGPA <= 10.0) {
         this.CGPA = CGPA;
     } else {
         System.out.println("Invalid CGPA! Must be between 0 and 10.");
     }
 }
 public void displayDetails() {
     System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
 }
}
class PostgraduateStudent extends Student {
 String specialization;
 public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
     super(rollNumber, name, CGPA);  
     this.specialization = specialization;
 }
 public void displayPGDetails() {
     System.out.println("Roll No: " + rollNumber + 
                        ", Name: " + name +   
                        ", Specialization: " + specialization + 
                        ", CGPA: " + getCGPA());
 }
}
public class University_Management {
 public static void main(String[] args) {
     Student s1 = new Student(101, "Suraj", 8.5);
     s1.displayDetails();
     s1.setCGPA(9.0);
     System.out.println("Updated CGPA: " + s1.getCGPA());
     PostgraduateStudent pg = new PostgraduateStudent(201, "Raj", 8.8, "Computer Science");
     pg.displayPGDetails();
 }
}
