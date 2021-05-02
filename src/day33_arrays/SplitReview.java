package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] strArr = word.split("a");
        System.out.println(strArr.length);
        System.out.println(Arrays.toString(strArr));
        
        int countOfA = strArr.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        System.out.println("-----SPLIt WITH EMPRY STRING------");

        String[] wordArr = word.split("");
        System.out.println(wordArr[0]);
        System.out.println(wordArr[1]);
        System.out.println(wordArr[2]);
        System.out.println(wordArr[3]);


        String word1 = "java1html2sql";
        String[] word2Arr = word1.split("\\d");
        System.out.println(Arrays.toString(word2Arr));

        word1 = word1.replaceAll("\\d", "_");
        System.out.println("word1 = " + word1);


        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
