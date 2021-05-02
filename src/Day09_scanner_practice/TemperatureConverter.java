package Day09_scanner_practice;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******WELCOME TO F to C TEMPERATURE CONVERTER******");

        System.out.println("Enter temperature in Fahrenheit");
        double temp = input.nextDouble();

        double result = (temp-32)*5/9;

        System.out.println("Temperature in Celsius is " + result);

    }
}
