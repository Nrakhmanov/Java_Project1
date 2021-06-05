package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;
    static List<String> carModels;
    static  {
        System.out.println("static initializer block");
        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("BMW", "MB", "Lexus", "Acura"));
    }

    { // initializer block -> runs each time object is created, before constructor
        System.out.println("initializer block");

    }

    public StaticBlockDemo() {
        System.out.println("Constructor method");
        num+=5;
    }

    public StaticBlockDemo(int value) {
        System.out.println("Overloaded constructor - value = " + value);
        num += value;
    }
}
