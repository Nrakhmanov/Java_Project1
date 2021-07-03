package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if (shape instanceof Circle) {
            System.out.println("it is a Circle object");
        } else if (shape instanceof Square) {
            System.out.println("it is a Square object");
        }

        System.out.println(shape.getClass().getSimpleName());// just class name of object
        System.out.println(shape.getClass().getName()); // package and class name
        if (shape.getClass().getSimpleName().equals("Circle")) {
            System.out.println("it is a circle object");
        }

        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println(el.getClass().getSimpleName());
        System.out.println(el.getClass());
    }

}
