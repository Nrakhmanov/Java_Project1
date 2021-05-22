package Replets;

import java.util.Scanner;

public class At3rdChar {
    static class Main {
        public static String at3(String target, String word) {


            String result = "";
            result = target.substring(0, 3) + word + target.substring(3, target.length());

            return result;


        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(at3(in.next(), in.next()));
        }
    }
}

