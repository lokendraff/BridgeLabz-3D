package Methods.Level2;

public class UnitConverter {
	 private static final double KM_TO_MILES = 0.621371;
	    private static final double MILES_TO_KM = 1.60934;
	    private static final double METERS_TO_FEET = 3.28084;
	    private static final double FEET_TO_METERS = 0.3048;
	    public static double convertKmToMiles(double km) {
	        return km * KM_TO_MILES;
	    }
	    public static double convertMilesToKm(double miles) {
	        return miles * MILES_TO_KM;
	    }
	    public static double convertMetersToFeet(double meters) {
	        return meters * METERS_TO_FEET;
	    }
	    public static double convertFeetToMeters(double feet) {
	        return feet * FEET_TO_METERS;
	    }
	    public static void main(String[] args) {
	        double km = 10;
	        double miles = 6.2;
	        double meters = 100;
	        double feet = 328;
	        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
	        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
	        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
	        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");

}
}