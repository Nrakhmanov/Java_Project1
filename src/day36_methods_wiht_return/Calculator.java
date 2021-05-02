package day36_methods_wiht_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(10.2, 28.3));
        double result = add(5, 7.3);
        System.out.println("result = " + result);
        System.out.println("100.0+200.0 = " + add(100, 200));

        System.out.println(minus(10, 3));
        System.out.println(divide(50, 4));
        System.out.println(multiply(23.45, 45.67));

    }

    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2){
        double sum = num1-num2;
        return sum;
    }
    public static double divide(double num1, double num2){
        double sum = num1/num2;
        return sum;
        }

        public static double multiply(double num1, double num2){
        double sum = num1*num2;
        return sum;
        }
}
