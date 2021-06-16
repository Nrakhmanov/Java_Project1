package day54_abstraction;

public class School {
    public static void main(String[] args) {
        OnlineStudent student1 = new OnlineStudent();
        student1.code("Java");
        student1.attendClass();

        CampusStudent student2 = new CampusStudent();
        student2.attendClass();
        student2.code("Ocaml");


    }
}

