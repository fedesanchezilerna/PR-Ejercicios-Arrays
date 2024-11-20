package ejercicios;

import utils.ScannerUtils;

public class Exercise_5 {

    public static void positiveNegativeNumbers() {
        int[] numbers = new int[10];
        int positives = 0, negatives = 0, zeros = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number: " + (i + 1) + ": ");
            numbers[i] = ScannerUtils.readInt();

            if (numbers[i] > 0) positives++;
            else if (numbers[i] < 0) negatives++;
            else zeros++;
        }

        System.out.println("Total positives: " + positives);
        System.out.println("Total negatives: " + negatives);
        System.out.println("Total zeros:     " + zeros);
    }
}
