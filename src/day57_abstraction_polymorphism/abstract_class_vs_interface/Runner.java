package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {

        InterfaceA.staticMethodE("wooden spoon");
        ConcreteA concreteA = new ConcreteA();
        concreteA.defaultMethodF();
        ConcreteA.staticMethodC();
    }
}
