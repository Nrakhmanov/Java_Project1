package Replets;
import java.util.Scanner;
public class timeclock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int second = scan.nextInt();
        String amOrPm = scan.next();
        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:


    }
}
