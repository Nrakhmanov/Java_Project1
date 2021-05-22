package Replets;

import java.util.Scanner;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here

        String reverse = "";

        for (int i = str.length()-1; i >=0; i--) {
            if(str.charAt(i)>='a' || str.charAt(i)<='z'){
                reverse += str.charAt(i);

            }

        }

return reverse;


    }
}
