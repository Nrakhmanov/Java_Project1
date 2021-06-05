package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();// runs static and constructor. static block runs only once at the beginning.
        StaticBlockDemo st2 = new StaticBlockDemo();// runs only constructor. constructor runs each time when we create new object
        StaticBlockDemo st3 = new StaticBlockDemo(); // runs only constructor.
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);
    }
}
