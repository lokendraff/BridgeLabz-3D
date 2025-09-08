package Constructor_Questions;
class Employee {
 public int employeeID;       
 protected String department;  
 private double salary; 
 public Employee(int employeeID, String department, double salary) {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }
 public double getSalary() {
     return salary;
 }
 public void setSalary(double salary) {
     if (salary >= 0) {
         this.salary = salary;
     } else {
         System.out.println("Invalid Salary! Must be non-negative.");
     }
 }
 public void displayDetails() {
     System.out.println("EmployeeID: " + employeeID +
                        ", Department: " + department +
                        ", Salary: " + salary);
 }
}
class Manager extends Employee {
 String teamName;
 public Manager(int employeeID, String department, double salary, String teamName) {
     super(employeeID, department, salary); 
     this.teamName = teamName;
 }
 public void displayManagerDetails() {
     System.out.println("Manager ID: " + employeeID +
                        ", Department: " + department +
                        ", Team: " + teamName +
                        ", Salary: " + getSalary()); 
 }
}
public class Employee_Records {
 public static void main(String[] args) {
     Employee e1 = new Employee(101, "Finance", 45000);
     e1.displayDetails();
     e1.setSalary(50000);
     System.out.println("Updated Salary: " + e1.getSalary());
     Manager m1 = new Manager(201, "IT", 70000, "Suraj Team");
     m1.displayManagerDetails();
 }
}

