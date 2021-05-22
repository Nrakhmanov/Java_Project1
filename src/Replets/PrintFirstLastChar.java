package Replets;

import java.util.Scanner;

public class PrintFirstLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        String str = "";
        for( String each : words){
            for(int i = 0; i<each.length()-1; i++){
                str = "" + each.charAt(0) + each.charAt(each.length()-1);

            }
            System.out.println(str);
        }




    }
}
