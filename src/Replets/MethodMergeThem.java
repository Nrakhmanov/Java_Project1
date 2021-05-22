package Replets;

import java.util.Scanner;

public class MethodMergeThem {
    public static String mergeStrings(String one, String two) {

        String merge = "";


        if(one.length()>two.length()){
            for(int i = 0; i<two.length(); i++) {
                merge += "" + one.charAt(i) + two.charAt(i);
            }
            merge += one.substring(two.length());
        }if(two.length()>one.length()){
            for(int i = 0; i<one.length(); i++ ) {
                merge += "" + one.charAt(i) + two.charAt(i);
            }
            merge += two.substring(one.length());
        }
        return merge;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
