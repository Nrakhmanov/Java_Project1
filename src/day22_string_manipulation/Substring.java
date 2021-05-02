package day22_string_manipulation;

public class Substring {
    public static void main(String[] args) {


        String word = "hello";

        System.out.println(word.substring(0,2));
        System.out.println(word.substring(2,4));


        System.out.println(word.substring(0));


        String word1 = "java is fun";

        System.out.println(word1.substring(0,3)); //jav
        System.out.println(word1.substring(0, 4)); //java

        System.out.println(word1.substring(5,7));
        System.out.println(word1.substring(8,11));

        System.out.println(word1.substring(8)); // another way to print word just to determine its start number




    }
}
