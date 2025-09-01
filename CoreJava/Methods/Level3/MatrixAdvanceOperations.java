package Methods.Level3;

import java.util.Scanner;

public class MatrixAdvanceOperations {
	public static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random() * 10); 
            }
        }
        return matrix;
    }
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
    public static double[][] transpose(double[][] A) {
        int n = A.length;
        double[][] result = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
    public static double determinant(double[][] A) {
        int n = A.length;
        if (n == 1) return A[0][0];
        if (n == 2) return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
        double det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * A[0][col] * determinant(minor(A, 0, col));
        }
        return det;
    }
    public static double[][] minor(double[][] A, int row, int col) {
        int n = A.length;
        double[][] result = new double[n - 1][n - 1];
        int r = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                result[r][c] = A[i][j];
                c++;
            }
            r++;
        }
        return result;
    }
    public static double[][] inverse(double[][] A) {
        int n = A.length;
        double det = determinant(A);
        if (det == 0) return null;
        double[][] adj = adjoint(A);
        double[][] inv = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inv[i][j] = adj[i][j] / det;
            }
        }
        return inv;
    }
    public static double[][] adjoint(double[][] A) {
        int n = A.length;
        double[][] adj = new double[n][n];
        if (n == 1) {
            adj[0][0] = 1;
            return adj;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double sign = ((i + j) % 2 == 0) ? 1 : -1;
                adj[j][i] = sign * determinant(minor(A, i, j));
            }
        }
        return adj;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        double[][] A = generateMatrix(n);
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Transpose of A:");
        printMatrix(transpose(A));
        double det = determinant(A);
        System.out.println("Determinant of A = " + det);
        if (det != 0) {
            System.out.println("Inverse of A:");
            printMatrix(inverse(A));
        } else {
            System.out.println("Matrix is singular, inverse does not exist.");
        }

}
}
