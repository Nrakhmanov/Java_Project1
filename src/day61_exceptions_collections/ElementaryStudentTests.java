package day61_exceptions_collections;

public class ElementaryStudentTests {
    public static void main(String[] args) {
        ElementaryStudent el1 = new ElementaryStudent();

        try {
            el1.setName("Bob");
            el1.setAge(13);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); //print the error stacktrace and continue
        }

        System.out.println("--- EXECUTION COMPLETE---");
    }
}
