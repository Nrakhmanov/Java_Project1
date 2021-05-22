package Replets;

import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above

        String shortWord = str[0];

        for(int i = 0; i <str.length; i++){


            if(str[i].length()<shortWord.length()){
                shortWord=str[i];
            }
        }

        System.out.println(shortWord);

    }
}
