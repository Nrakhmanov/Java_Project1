package day50_inheritance;
/*
child calls
derived class
sub class
 */

public class Teacher extends Person{

    int teacherID;

    public void teach(String topic){
        System.out.println("Teacher is teaching " + topic);
    }
}
