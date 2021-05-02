package Replets;

import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

       // char last = word.charAt(word.length()-1);
        System.out.println(word.charAt(word.length()-1));
    }
}
