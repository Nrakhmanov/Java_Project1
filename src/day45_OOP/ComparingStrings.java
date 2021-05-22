package day45_OOP;

public class ComparingStrings {
    public static void main(String[] args) {

        String word1 = "java";//int string pool
        String word2 = "java"; // re-use from string pool
        String word3 = new String("java"); //created NEW Object in HEAP, outside String pool
        String word4 = new String("java"); //created NEW Object in HEAP, outsideString pool


        // == checks if the variables point/refer to the same object
        System.out.println(word1 == word2); //True - point to same object in string pool
        System.out.println(word1 == word3); //False
        System.out.println(word3 == word4); //False -  point to different objects in HEAP

        // .equals() compares values, characters of variables
        System.out.println(word1.equals(word2)); //True
        System.out.println(word1.equals(word3)); //True
        System.out.println(word1.equals(word4)); //True
        System.gc();



    }
}
