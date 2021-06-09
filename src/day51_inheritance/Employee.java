package day51_inheritance;

public class Employee {
    String jobTitle;

    public double calculateSalary(double hourlyRate) {

        return hourlyRate * 52 * 40 * 1.1;

    }

}
