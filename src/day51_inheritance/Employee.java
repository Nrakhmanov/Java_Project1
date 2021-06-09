package day51_inheritance;

public class Employee {
    String jobTitle;

    public double calculateSalary(double hourlyRate) {

        return hourlyRate * 50*40 * 1.1;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
