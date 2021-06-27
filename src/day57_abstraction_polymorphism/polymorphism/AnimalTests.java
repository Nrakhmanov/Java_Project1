package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {

        Animal animal1 = new Dog();
        animal1.makeNoise();

        Animal animal2 = new Horse();
        animal2.makeNoise();

        Animal animal3 = new Cat();
        animal3.makeNoise();


        List<Animal> listOfanimals = new ArrayList<>();
        listOfanimals.add(new Dog());
        listOfanimals.add(new Dog());
        listOfanimals.add(new Horse());
        listOfanimals.add(new Cat());

        for (Animal each: listOfanimals) {
            each.makeNoise();

        }


    }
}
