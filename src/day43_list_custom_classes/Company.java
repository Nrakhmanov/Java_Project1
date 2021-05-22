package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "Satoshi Nakamoto";
        employee1.jobTitle = "Scrum Master";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.name = "Donald Trump";
        employee2.jobTitle = "Product Owner";
        employee2.work();

        Employee employee3 = new Employee();
        employee3.name = "Who Cares";
        employee3.jobTitle = "Bussiness Analysts";
        employee3.work();
    }
}
