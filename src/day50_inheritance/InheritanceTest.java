package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Heisenberg";
        p1.age = 42;

        p1.walk();
        p1.talk();
        p1.work("Chemistry teacher");

        Teacher t1 = new Teacher();
        t1.teacherID = 12345;
        t1.name = "Banner";
    }
}
