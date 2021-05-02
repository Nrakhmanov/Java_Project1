package Replets;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        String vowels = "";



        for(int i =0; i<word.length(); i++) {
            char letter = word.charAt(i);

            switch (letter) {
                case 'a':
                case 'e':
                case 'u':
                case 'i':
                case 'o':
                    vowels += letter;
                    break;

            }


        }
        System.out.println(vowels);
    }
}
