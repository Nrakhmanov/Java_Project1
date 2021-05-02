package Day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConvert {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles :");
        double miles = input.nextDouble();

        double distance = miles*1.609;
        System.out.println(miles + " miles in kilometers :" + distance);

    }
}
