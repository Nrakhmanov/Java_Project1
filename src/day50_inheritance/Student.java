package day50_inheritance;

public class Student extends Person {

    String school;

    public void study(String topic) {
        System.out.println(name +" is " + age + " years old and is a student at " + school + " and studying " + topic);

    }
}
