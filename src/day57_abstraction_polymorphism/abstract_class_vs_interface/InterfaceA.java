package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    public static final String TYPE = "Interface";
    double MAX_COUNT = 500; // this is also public static final variable

    //private int num; Interface can not have other type of variables, other than public static final

    public abstract void absMethodD(int num);//interface can have abstract method

   // interface can have static method
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }

    //interface can have default method
    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }
}
