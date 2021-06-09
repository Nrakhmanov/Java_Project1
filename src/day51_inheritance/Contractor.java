package day51_inheritance;

public class Contractor extends Employee {
    @Override
    public double calculateSalary (double hourlyRate){
        return hourlyRate * 50*40;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
