package day51_inheritance;

public class Contractor extends Employee{
    public double calculateSalary (double hourlyRate){
        return hourlyRate * 50 * 40;
    }

}
