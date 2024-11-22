package ejercicios;

import utils.ScannerUtils;

public class Exercise_11 {
    public static void variableMatrix() {
        // Set matrix size
        System.out.print("Enter the size to create NxN matrix N°1: ");
        int n = ScannerUtils.readInt();

        // Matrix creation
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] resultMatrix = new int[n][n];

        // Fill matrix1 (user data)
        System.out.println("\nEnter the values for matrix N°1");
        fillMatrix(matrix1);

        // Fill matrix2 (user data)
        System.out.println("\nEnter the values for matrix N°2");
        fillMatrix(matrix2);

        // Fill resultMatrix (addition matrix1 & matrix2)
        fillResultMatrix(matrix1, matrix2, resultMatrix);

        // Show matrices
        System.out.println("\nMatrix N°1");
        printMatrix(matrix1);

        System.out.println("\nMatrix N°2");
        printMatrix(matrix2);

        System.out.println("\nMatrix N°3");
        printMatrix(resultMatrix);
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter value for position [%d][%d]: ", i, j);
                matrix[i][j] = ScannerUtils.readInt();
            }
        }
    }

    private static void fillResultMatrix(int[][] matrix1, int[][] matrix2, int[][] resultMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
