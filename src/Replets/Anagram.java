package Replets;

import java.util.Scanner;

public class Anagram {

        public static boolean isAnagram (String word1, String word2){
            boolean check = true;

            word1 = word1.replace(" ", "").toLowerCase();
            word2 = word2.replace(" ", "").toLowerCase();

            for (int i = 0; i < word1.length(); i++) {
                if (word1.length() != word2.length()) {

                    check = false;
                    break;

                }
                if (!word1.contains("" + word2.charAt(i))) {
                    check = false;
                }
            }
            return check;


        }

        // Do not touch below


        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println(isAnagram(in.nextLine(), in.nextLine()));
        }
    }

