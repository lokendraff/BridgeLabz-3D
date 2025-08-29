package bestProgrammingPractices_level1;

class ConvertKilometersToMiles {

    public static void main(String[] args) {

        // Distance in kilometers
        double kilometers = 10.8;

        // Conversion factor
        double milesPerKm = 1.6;

        // Convert to miles
        double miles = kilometers / milesPerKm;

        // Display result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
