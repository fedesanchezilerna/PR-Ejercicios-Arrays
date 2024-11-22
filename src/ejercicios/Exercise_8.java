package ejercicios;

import utils.ScannerUtils;

public class Exercise_8 {

    public static void employeeSalary() {
        String[] names = new String[20];
        double[] salary = new double[20];
        String higherName = "";
        double higherSalary = Double.MIN_VALUE;

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Enter the name of employee %d: ", i + 1);
            names[i] = ScannerUtils.getScanner().nextLine();

            System.out.printf("Enter the salary of employee %d: ", i + 1);
            salary[i] = ScannerUtils.readDouble();

            // Check higher salary
            if (salary[i] > higherSalary) {
                higherSalary = salary[i];
                higherName = names[i];
            }
        }

        // Show high salary-name
        System.out.println("The employee with the highest salary is: " + higherName + " -> Salary of = " + higherSalary);
    }
}
