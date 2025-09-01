package Methods.Level3;

import java.util.Scanner;

public class MatrixOperations {
	 public static int[][] generateMatrix(int rows, int cols) {
	        int[][] matrix = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = (int)(Math.random() * 10); 
	            }
	        }
	        return matrix;
	    }
	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.print(val + "\t");
	            }
	            System.out.println();
	        }
	    }
	    public static int[][] addMatrices(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] + B[i][j];
	            }
	        }
	        return result;
	    }
	    public static int[][] subtractMatrices(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] - B[i][j];
	            }
	        }
	        return result;
	    }
	    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = B[0].length;
	        int common = A[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = 0;
	                for (int k = 0; k < common; k++) {
	                    result[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter rows for Matrix A: ");
	        int rowsA = sc.nextInt();
	        System.out.print("Enter cols for Matrix A: ");
	        int colsA = sc.nextInt();
	        System.out.print("Enter rows for Matrix B: ");
	        int rowsB = sc.nextInt();
	        System.out.print("Enter cols for Matrix B: ");
	        int colsB = sc.nextInt();
	        int[][] A = generateMatrix(rowsA, colsA);
	        int[][] B = generateMatrix(rowsB, colsB);
	        System.out.println("\nMatrix A:");
	        printMatrix(A);
	        System.out.println("\nMatrix B:");
	        printMatrix(B);
	        if (rowsA == rowsB && colsA == colsB) {
	            System.out.println("\nMatrix Addition:");
	            printMatrix(addMatrices(A, B));

	            System.out.println("\nMatrix Subtraction:");
	            printMatrix(subtractMatrices(A, B));
	        } else {
	            System.out.println("\nAddition and Subtraction not possible (dimension mismatch).");
	        }
	        if (colsA == rowsB) {
	            System.out.println("\nMatrix Multiplication:");
	            printMatrix(multiplyMatrices(A, B));
	        } else {
	            System.out.println("\nMultiplication not possible (A's cols != B's rows).");
	        }
}
}
