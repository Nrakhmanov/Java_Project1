package Replets;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()%2!=0 && word.length()>=3){
            System.out.println(word.charAt(word.length()/2));
        } if(word.length() ==1){
            word=word+word+word;
            System.out.println(word);
        }else if(word.length()%2==0 && word.length()>=4){
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));
        }if(word.length()==2){
            word=word+word;
            System.out.println(word);
        }
    }
}
