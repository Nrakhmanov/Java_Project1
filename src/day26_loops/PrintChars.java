package day26_loops;

public class PrintChars {
    public static void main(String[] args) {

        String word = "selenium";

        for(int i = 0; i<word.length(); i++){
        //for(int i = word.length() -1; i>=0; i--){//to print reverse
            System.out.println(word.charAt(i));

        }
    }
}
/*

in String, when you use .length(), it will count total number of characters. But index of those characters starts from 0.
for example word - java. length of word is 4 characters but index for that word is from 0 to 3 (0123).
 */