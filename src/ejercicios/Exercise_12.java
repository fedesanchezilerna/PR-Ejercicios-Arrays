package ejercicios;

import utils.ScannerUtils;

public class Exercise_12 {

    public static void matrixNxM() {
        System.out.println("Set the matrix NxM size");
        System.out.print("Enter N: ");
        int n = ScannerUtils.readInt();
        System.out.print("Enter M: ");
        int m = ScannerUtils.readInt();

        int[][] matrix = new int[n][m];

        // Fill matrix
        Exercise_11.fillMatrix(matrix);

        // Find and print higher & lower
        findPrintHigherLower(matrix);
    }

    private static void findPrintHigherLower(int[][] matrix) {
        int higher = Integer.MIN_VALUE;
        int lower = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > higher) {
                    higher = value;
                }
                if (value < lower) {
                    lower = value;
                }
            }
        }
        System.out.println("Higher number: " + higher);
        System.out.println("Lower number: " + lower);
    }
}
