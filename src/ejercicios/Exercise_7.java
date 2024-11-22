package ejercicios;

import utils.ScannerUtils;

public class Exercise_7 {

    public static void avgHeight() {
        // Set number of people
        System.out.print("Enter the number of people: ");
        int numOfPeople = ScannerUtils.readInt();

        double[] heights = new double[numOfPeople];
        double addition = 0;

        // Set people height
        System.out.println("Set people height in meters - Example: 1.83");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter people " + (i + 1) + " height in m: ");
            heights[i] = ScannerUtils.readDouble();
            addition += heights[i];
        }

        // Show heights average
        double average = addition / numOfPeople;
        System.out.printf("Group heights average: %.2f\n", average);

        // Show +avg heights
        System.out.println("\nPeople with +avg heights:");
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > average) {
                System.out.println("People " + (i + 1) + " - Height: " + heights[i]);
            }
        }
    }
}
