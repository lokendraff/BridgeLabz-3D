package bestProgrammingPractices_level1;

class DistributePensEqually {

    public static void main(String[] args) {

        // Total pens and students
        int pens = 14;
        int students = 3;

        // Calculate pens per student
        int pensPerStudent = pens / students;

        // Remaining pens
        int remainingPens = pens % students;

        // Display result
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
