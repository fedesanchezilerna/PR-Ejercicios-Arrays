package utils;

public class Menu {

    public static void mainMenu() {
        System.out.println("""
                =============================
                MAIN MENU
                Select an exercise:
                1.  Average 10 numbers
                2.  Average 10 numbers (even positions)
                3.  Student Group Notes
                4.  Even Numbers
                5.  Positives Negatives, Zeros
                6.  Positives Negatives Averages
                7.  
                8.  
                9.  
                10. 
                11. 
                12. 
                                
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
