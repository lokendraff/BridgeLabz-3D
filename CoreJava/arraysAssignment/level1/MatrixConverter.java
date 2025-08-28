package arrays;
import java.util.Arrays;
import java.util.Scanner;

class MatrixConverter {
    public static void main(String[] args) {
        int rows, cols;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrix: ");
        rows = input.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        int[] singleDimensionArray = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                singleDimensionArray[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("\nThe 2D Array (Matrix) was:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        
        System.out.println("\nThe converted 1D Array is:");
        System.out.println(Arrays.toString(singleDimensionArray));
        
        input.close();
    }
}
