package utils;

import java.util.Scanner;

public class ScannerUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * Read a number safely. Consume line by using nextLine()
     * @return Integer enter by user.
     */
    public static int readInt() {
        int number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number: ");
            }
        }
        return number;
    }

    /**
     * Read a number safely. Consume line by using nextLine()
     * @return Double enter by user.
     */
    public static double readDouble() {
        double number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number: ");
            }
        }
        return number;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
