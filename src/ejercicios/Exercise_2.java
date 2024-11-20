package ejercicios;

import utils.ScannerUtils;

public class Exercise_2 {

    public static void avgNumbersInEvenPositions() {
        int[] numbers = new int[10];
        int addition = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            numbers[i] = ScannerUtils.readInt();

            // Addition only in even positions
            if (i % 2 == 0) {
                addition += numbers[i];
            }
        }

        double average = addition / 5.0;
        System.out.println("Average of introduced numbers is: " + average);
    }
}
