package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.jobTitle = "SDET";
        double annualSalary = employee.calculateSalary(55.0);
        System.out.println("annualSalary = " + Math.round(annualSalary));
        System.out.println(employee);

        Contractor contractor = new Contractor();
        contractor.jobTitle = "SDET Contractor";
        double annualContractorSalary = contractor.calculateSalary(50.0);
        System.out.println("annualContractorSalary = " + annualContractorSalary);
        System.out.println(contractor);

    }
}
