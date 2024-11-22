package ejercicios;

import utils.ScannerUtils;

public class Exercise_3 {

    public static void studentsGroupNotes() {
        // Set number of students
        System.out.print("Enter students number: ");
        int numOfStudents = ScannerUtils.readInt();

        double[] notes = new double[numOfStudents];
        double addition = 0;

        // Set student notes
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Enter student " + (i + 1) + " note: ");
            notes[i] = ScannerUtils.readDouble();
            addition += notes[i];
        }

        // Show notes average
        double average = addition / numOfStudents;
        System.out.println("Group notes average: " + average);

        // Show +avg notes
        System.out.println("Student with +avg notes:");
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > average) {
                System.out.println("Student " + (i + 1) + " - Note: " + notes[i]);
            }
        }
    }
}
