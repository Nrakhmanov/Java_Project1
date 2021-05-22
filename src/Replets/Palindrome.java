package Replets;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String check) {

        // your code here
        
        String reverse = "";
        for (int i = check.length(); i >= 0 ; i--) {
            reverse+= check.charAt(i);
            
        }

        return check.replace(" ","").equalsIgnoreCase( reverse.replace(" ",""));
    }
        // Do not touch below

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println(isPalindrome(in.nextLine()));

    }
}
