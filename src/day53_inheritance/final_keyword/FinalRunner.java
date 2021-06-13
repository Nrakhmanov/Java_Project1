package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        System.out.println(TestData.ADMIN_PASSWORD);

        //TestData.ADMIN_USERNAME = "change" ERROR: cannot change value of final variable.
        final int SSN = 123456789;
        //SSN = 987654321; ERROR: variable is final. cannot change the value.
    }

}
