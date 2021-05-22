package Replets;

import java.util.Arrays;
import java.util.Scanner;

public class Printing_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }

        String wordsOf3 = "";

        for (int i = 0; i < arr.length-2; i++) {
            wordsOf3 = arr[i] + ", " + arr[i+1] + ", " + arr[i+2];
            System.out.println(wordsOf3);
        }




    }
}
