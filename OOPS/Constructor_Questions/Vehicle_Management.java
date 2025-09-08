package Constructor_Questions;
class Vehicle {
 String ownerName;
 String vehicleType;
 static double registrationFee = 5000.0;
 public Vehicle(String ownerName, String vehicleType) {
     this.ownerName = ownerName;
     this.vehicleType = vehicleType;
 }
 public void displayVehicleDetails() {
     System.out.println("Owner: " + ownerName + 
                        ", Vehicle Type: " + vehicleType + 
                        ", Registration Fee: " + registrationFee);
 }
 public static void updateRegistrationFee(double newFee) {
     registrationFee = newFee;
     System.out.println("Registration Fee updated to: " + registrationFee);
 }
}
public class Vehicle_Management {
 public static void main(String[] args) {
     Vehicle v1 = new Vehicle("Suraj", "Car");
     Vehicle v2 = new Vehicle("Piyush", "Motorcycle");
     v1.displayVehicleDetails();
     v2.displayVehicleDetails();
     Vehicle.updateRegistrationFee(7500.0);
     v1.displayVehicleDetails();
     v2.displayVehicleDetails();
 }
}

