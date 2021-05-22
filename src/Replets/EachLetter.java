package Replets;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        char letter;

        for(int i =0; i<=word.length()-1; i++){

            System.out.println(word.charAt(i));
        }
    }
}
