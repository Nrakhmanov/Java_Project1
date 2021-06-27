package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "Java";

    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

        // abstract methods cannot be private, static or final
    public abstract void absMethodA();
    public void methodB() {
        System.out.println("methodB is called");
    }
    public static void staticMethodC() {
        System.out.println("static MethodC is called");
    }
}
