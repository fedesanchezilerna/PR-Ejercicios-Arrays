package ejercicios;

import utils.ScannerUtils;

public class Exercise_8 {

    public static void employeeSalary() {
        String[] names = new String[20];
        int[] salaries = new int[20];
        String higherName = "";
        int higherSalary = 0;

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter employee " + (i + 1) + " name: ");
            String name = ScannerUtils.getScanner().nextLine();

            System.out.print("Enter employee " + (i + 1) + " salary: ");
            int salary = ScannerUtils.readInt();

            if (salary > higherSalary) {
                higherSalary = salary;
                higherName = name;
            }
        }

        // Show high salary-name
        System.out.println("The employee with the highest salary is: " + higherName + " -> Salary of = " + higherSalary);
    }
}
