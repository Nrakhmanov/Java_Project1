package day49_static;

public class StaticTest {
    static String word = "java"; // if String word ="java" -> static method cannot access this variable

    public static void main(String[] args) {
        // rule 1-a: stativ method can be called using classname and method name
        StaticMethods.displayMessage("elo elo");
        // rule 1-b: instance method need an object to be called
       // StaticMethods.instanceMethod() : ERROR
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        // rule 2: static method can only access other static variables and methods
        System.out.println(word);

    }
}
