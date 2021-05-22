package Replets;


import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        String[] clock = s.split(":");
        String result = "";
        if (s.contains("12") && s.contains("PM")) {
            s.replace("PM", "");
            for (int i = 0; i <= clock.length; i++) {
                clock[i] = "" + (i + 12);
            }
            if (s.contains("12") && s.contains("AM")) {
                s.replace("AM", "");
                s = "00";
            }

        }
        result = String.join(":", clock);

        System.out.println(result);
    }
}