package ejercicios;

public class Exercise_4 {

    public static void evenNumbersArray() {
        int[] evenNumbersArray = new int[20];

        for (int i = 0; i < evenNumbersArray.length; i++) {
            // evenNumbersArray[i] = (int) ((Math.random() * 10) + 1) * 2; formula for random even numbers
            evenNumbersArray[i] = (i + 1) * 2;
        }

        System.out.println("First 20 even numbers: ");
        for (int even :
                evenNumbersArray) {
            System.out.println(even + " ");
        }
    }
}
