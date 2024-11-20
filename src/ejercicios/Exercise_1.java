package ejercicios;

import utils.ScannerUtils;

public class Exercise_1 {
    public static void avgTenNumbers() {
        int[] numbers = new int[10];
        int addition = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            numbers[i] = ScannerUtils.readInt();

            addition += numbers[i];
        }

        double average = addition / 10.0;
        System.out.println("Average of introduced numbers is: " + average);
    }
}
