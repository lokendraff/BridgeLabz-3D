package bestProgrammingPractices_level1;

class CalculatePcmAverage {

    public static void main(String[] args) {

        // Marks in PCM subjects
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        // Calculate average
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3.0;

        // Display result
        System.out.println("Sam’s average mark in PCM is " + averageMarks);
    }
}
