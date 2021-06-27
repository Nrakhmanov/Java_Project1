package day57_abstraction_polymorphism.shapes;


import java.util.ArrayList;
import java.util.List;

public class ShapesTest {


    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle());
        shapeList.add(new Circle());
        shapeList.add(new Square());

        for(Shape each : shapeList){
            each.draw();
        }

        drawShape(new Circle());
        drawShape(new Triangle());
        drawShape(new Square());
    }

    public static void drawShape(Shape shape) {
        System.out.println("----Drawinf shape----");
        shape.draw();
    }
}
