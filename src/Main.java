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
                break;
            case 4:
                runExerciseMsg(exerciseNum);
                Exercise_4.evenNumbersArray();
                break;
            case 5:
                runExerciseMsg(exerciseNum);
                Exercise_5.positiveNegativeNumbers();
                break;
            case 6:
                runExerciseMsg(exerciseNum);
                Exercise_6.positiveNegativeAvg();
                break;
            case 7:
                runExerciseMsg(exerciseNum);
                Exercise_7.avgHeight();
                break;
            case 8:
                runExerciseMsg(exerciseNum);
                Exercise_8.employeeSalary();
                break;
            case 9:
                runExerciseMsg(exerciseNum);
                Exercise_9.matrixDisplay();
                break;
            case 10:
                runExerciseMsg(exerciseNum);
                Exercise_10.randomNumbersMatrix();
                break;
            case 11:
                runExerciseMsg(exerciseNum);
                Exercise_11.variableMatrix();
                break;
            case 12:
                runExerciseMsg(exerciseNum);
                Exercise_12.matrixNxM();
                break;
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