package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.jobTitle = "SDET";
        double annualSalary = employee.calculateSalary(45.0);
        System.out.println("annualSalary = " + Math.round(annualSalary));


    }
}
