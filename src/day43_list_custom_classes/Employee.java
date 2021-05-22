package day43_list_custom_classes;

public class Employee {
    //instance/ object variables
    String name, jobTitle;

    //instance/ object method
    public void work(){
        System.out.println(name + " works as " + jobTitle);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Ken Adams";
        employee.jobTitle = "SDET";
        employee.work();
    }
}
