package Constructor_Questions;

public class CarRental {
	String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0;
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Generic Car";
        this.rentalDays = 1;
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                           ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Suraj", "Bolero", 5);
        cr1.display();
        cr2.display();
    }

}
