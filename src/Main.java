import ejercicios.*;
import utils.Menu;
import utils.ScannerUtils;

public class Main {

    static int exercise;
    static boolean resume;

    public static void main(String[] args) {
        exerciseSelector();
        ScannerUtils.closeScanner();
    }

    private static void exerciseSelector() {
        do {
            Menu.mainMenu();

            exercise = ScannerUtils.readInt();
            if (exercise == 0) {
                System.out.println("Close application.");
                resume = false;
                break;
            } else {
                runExercise(exercise);
                runEndMenu();
            }
        } while (resume);
    }

    private static void runExercise(int exerciseNum) {
        switch (exerciseNum) {
            case 1:
                runExerciseMsg(exerciseNum);
                Exercise_1.avgTenNumbers();
                break;
            case 2:
                runExerciseMsg(exerciseNum);
                Exercise_2.avgNumbersInEvenPositions();
                break;
            case 3:
                runExerciseMsg(exerciseNum);
                Exercise_3.studentsGroupNotes();
            case 4:
                runExerciseMsg(exerciseNum);
                Exercise_4.evenNumbersArray();
            case 5:
                runExerciseMsg(exerciseNum);
                Exercise_5.positiveNegativeNumbers();
            case 6:
                runExerciseMsg(exerciseNum);
                Exercise_6.positiveNegativeAvg();
            default:
                System.out.println("Undefined exercise.");
                break;
        }
    }

    private static void runExerciseMsg(int exercise) {
        System.out.println("Running exercise " + exercise + "...");
    }

    private static void runEndMenu() {
        Menu.endExerciseMenu();
        int option = ScannerUtils.readInt();
        switch (option) {
            case 0:
                System.out.println("Closing application...");
                resume = false;
                break;
            case 1:
                resume = true;
                break;
            default:
                System.out.println("Invalid option. Closing program.");
        }
    }
}