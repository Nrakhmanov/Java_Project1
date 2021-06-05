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

    public StaticBlockDemo() {
        System.out.println("Constructor method");
        num+=5;
    }
}
