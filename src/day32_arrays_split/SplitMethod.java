package day32_arrays_split;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String words = "java, python, selenium, html";
        String[] wordsArray = words.split(":");

        System.out.println(Arrays.toString(wordsArray));

        System.out.println("Length of Array = " + wordsArray.length);

        for (String each : wordsArray) {
            System.out.println(each);
        }

        String sentence = "Kto hodit v gosti po utram";
        String[] sentenceArray = sentence.split(" ");

        for (String each : sentenceArray) {
            System.out.println(each);
        }
        System.out.println(sentenceArray[0]);
        System.out.println(sentence.split(" ")[0]);
        System.out.println("number of words in sentence = " + sentenceArray.length);





    }

}





