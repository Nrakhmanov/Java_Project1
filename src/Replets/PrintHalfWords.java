package Replets;

import java.util.Scanner;

public class PrintHalfWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String half = word.substring(0,word.length()/2);

        System.out.println(half+half);

    }
}
