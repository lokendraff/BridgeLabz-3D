package Methods.Level2;

public class FahrenheitToCelsius {
	public static double convertFahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5.0 / 9.0;
	}

	public static double convertCelsiusToFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32;
	}

	private static final double POUNDS_TO_KILOGRAMS = 0.453592;
	private static final double KILOGRAMS_TO_POUNDS = 2.20462;

	public static double convertPoundsToKilograms(double pounds) {
		return pounds * POUNDS_TO_KILOGRAMS;
	}

	public static double convertKilogramsToPounds(double kilograms) {
		return kilograms * KILOGRAMS_TO_POUNDS;
	}

	private static final double GALLONS_TO_LITERS = 3.78541;
	private static final double LITERS_TO_GALLONS = 0.264172;

	public static double convertGallonsToLiters(double gallons) {
		return gallons * GALLONS_TO_LITERS;
	}

	public static double convertLitersToGallons(double liters) {
		return liters * LITERS_TO_GALLONS;
	}

	public static void main(String[] args) {
		double fahrenheit = 98.6;
		double celsius = 37;
		double pounds = 150;
		double kilograms = 68;
		double gallons = 5;
		double liters = 10;
		System.out.println(fahrenheit + "°F = " + convertFahrenheitToCelsius(fahrenheit) + "°C");
		System.out.println(celsius + "°C = " + convertCelsiusToFahrenheit(celsius) + "°F");
		System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kg");
		System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " pounds");
		System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
		System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
	}
}
