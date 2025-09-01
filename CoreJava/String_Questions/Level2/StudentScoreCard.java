package String_Questions.Level2;

import java.util.Random;

public class StudentScoreCard {
	 public static int[][] generateScores(int n) {
	        Random ran = new Random();
	        int[][] scores = new int[n][3];  
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < 3; j++) {
	                scores[i][j] = ran.nextInt(41) + 60; 
	            }
	        }
	        return scores;
	    }
	    public static double[][] calculateResults(int[][] scores) {
	        int n = scores.length;
	        double[][] results = new double[n][3]; 
	        for (int i = 0; i < n; i++) {
	            int total = scores[i][0] + scores[i][1] + scores[i][2];
	            double average = total / 3.0;
	            double percentage = (total / 300.0) * 100;
	            results[i][0] = total;
	            results[i][1] = Math.round(average * 100.0) / 100.0;
	            results[i][2] = Math.round(percentage * 100.0) / 100.0;
	        }
	        return results;
	    }
	    public static String[] assignGrades(double[][] results) {
	        int n = results.length;
	        String[] grades = new String[n];
	        for (int i = 0; i < n; i++) {
	            double percent = results[i][2];
	            if (percent >= 90) {
	                grades[i] = "A+";
	            } else if (percent >= 80) {
	                grades[i] = "A";
	            } else if (percent >= 70) {
	                grades[i] = "B";
	            } else if (percent >= 60) {
	                grades[i] = "C";
	            } else if (percent >= 50) {
	                grades[i] = "D";
	            } else {
	                grades[i] = "F";
	            }
	        }
	        return grades;
	    }
	    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
	        System.out.println(" ");
	        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-10s\n",
	                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
	        System.out.println(" ");
	        for (int i = 0; i < scores.length; i++) {
	            System.out.printf("%-10s %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-10s\n",
	                    "S" + (i + 1), scores[i][0], scores[i][1], scores[i][2],
	                    results[i][0], results[i][1], results[i][2], grades[i]);
	        }
	        System.out.println(" ");
	    }
	    public static void main(String[] args) {
	        int students = 5;
	        int[][] scores = generateScores(students);
	        double[][] results = calculateResults(scores);
	        String[] grades = assignGrades(results);
	        displayScoreCard(scores, results, grades);
}
}

