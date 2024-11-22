package ejercicios;

public class Exercise_9 {

    public static void matrixDisplay() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Code optimization
        for (int[] ints : matrix) {
            StringBuilder row = new StringBuilder();
            for (int anInt : ints) {
                row.append(anInt).append(" ");
            }
            System.out.println(row.toString().trim());
        }
        /*
        for (int i = 0; i < matrix.length; i++) {
            String row = "";
            for (int j = 0; j < matrix[i].length; j++) {
                row += matrix[i][j] + " ";
            }
            System.out.println(row.trim());
        }
        */
    }
}
