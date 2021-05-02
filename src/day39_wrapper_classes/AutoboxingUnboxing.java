package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = num1; //autoboxing = primitive to Wrapper class

        Integer n1 = new Integer (200);
        int n2 = n1;

        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(69.69); //unboxing = Wrapper class to primitive



    }
}
