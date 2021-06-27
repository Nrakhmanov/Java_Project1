package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
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
