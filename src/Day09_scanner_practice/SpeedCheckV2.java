package Day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter Speed limit");
        int speedLimit = input1.nextInt();
        System.out.println("enter your current speed");
        int currentSpeed = input2.nextInt();
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("Your speed is " + overTheLimit + "mph over the limit. SLOW DOWN");

    }
}
