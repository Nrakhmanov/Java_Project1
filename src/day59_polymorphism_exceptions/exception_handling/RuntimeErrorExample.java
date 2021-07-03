package day59_polymorphism_exceptions.exception_handling;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0); //RUNTIMEEXCEPTION happens in this line of code at the time of execution.
        System.out.println(10/3);
    }
}
