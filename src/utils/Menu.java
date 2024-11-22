package utils;

public class Menu {

    public static void mainMenu() {
        System.out.println("""
                
                =============================
                MAIN MENU
                Select an exercise:
                1.  Average 10 numbers.
                2.  Average 10 numbers (even positions).
                3.  Student Group Notes.
                4.  Even Numbers.
                5.  Positives Negatives, Zeros.
                6.  Positives Negatives Averages.
                7.  Heights.
                8.  Employees Salaries.
                9.  Matrix 3x3.
                10. Random Number Matrix.
                11. Matrix NxN & Matrix Addition.
                12. Matrix NxM Higher & Lower Values.
                                
                =============================
                """);
    }

    public static void endExerciseMenu() {
        System.out.println("""
                
                ===============================
                End of exercise.
                0.  Exit application.
                1.  Back to Main Menu.
                ===============================
                """);
    }
}
