package day36_methods_wiht_return;

public class Calculations {
    public static void main(String[] args) {


        System.out.println("substract 50-49 = " + Calculator.minus(50, 49));
        System.out.println("add 10+45 = " + Calculator.add(10,45));

        double d1 = 123.45;
        double d2 = 567.89;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = " + result);



    }
}
