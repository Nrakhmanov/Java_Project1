package day50_inheritance.overriding;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Muhtar";
        animal.type = "German Shepherd";
        animal.speak();


        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();

    }
}
