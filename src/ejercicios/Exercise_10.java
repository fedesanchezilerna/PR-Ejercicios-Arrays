package ejercicios;

import utils.ScannerUtils;

import java.util.Random;

public class Exercise_10 {

    public static void randomNumbersMatrix() {
        Random random = new Random();
        System.out.println("Enter the number of matrix columns: ");
        int columns = ScannerUtils.readInt();

        int[][] matrix = new int[5][columns];

        // Inject numbers
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 10); // (int) ((Math.random() * 9) + 1)
            }
        }

        // Print matrix
        for (int[] row : matrix) {
            StringBuilder rowString = new StringBuilder();
            for (int value : row) {
                rowString.append(value).append(" ");
            }
            System.out.println(rowString.toString().trim());
        }
    }
}
