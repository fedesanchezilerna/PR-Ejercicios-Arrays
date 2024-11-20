package ejercicios;

import utils.ScannerUtils;

public class Exercise_6 {

    public static void positiveNegativeAvg() {
        int[] numbers = new int[10];
        int positivesCounter = 0, negativesCounter = 0, positivesAddition = 0, negativesAddition = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number: " + (i + 1) + ": ");
            numbers[i] = ScannerUtils.readInt();

            if (numbers[i] > 0) {
                positivesCounter++;
                positivesAddition += numbers[i];
            } else if (numbers[i] < 0) {
                negativesCounter++;
                negativesAddition += numbers[i];
            }
        }

        // Calculate and show averages
        double positivesAvg = positivesCounter == 0 ? 0 : (double) positivesAddition / positivesCounter;
        double negativesAvg = negativesCounter == 0 ? 0 : (double) negativesAddition / negativesCounter;
        System.out.println("Positives average: " + positivesAvg);
        System.out.println("Negatives average: " + negativesAvg);
    }
}
