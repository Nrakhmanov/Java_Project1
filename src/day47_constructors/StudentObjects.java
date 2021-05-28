package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Shiba-Inu");
        Student st4 = new Student("Akita-Inu");

        Student st5 = new Student("Satoshi Nakamoto", 49);

        Student st6 = new Student();
        st6.setName("Satoshi Nakamoto");
        st6.setAge(49);
        System.out.println(st6.toString());
    }
}
