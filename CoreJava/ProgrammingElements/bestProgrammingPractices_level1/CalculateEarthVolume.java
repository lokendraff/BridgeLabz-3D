package bestProgrammingPractices_level1;

class CalculateEarthVolume {

    public static void main(String[] args) {

        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor (1 mile = 1.6 kilometers)
        double kmPerMile = 1.6;

        // Volume formula = (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm / kmPerMile;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
