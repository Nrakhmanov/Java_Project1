package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator.add(5, 10);

        Calculator test = new Calculator();
        test.multiply(5,10);

        test.add(5, 10);
    }
}
