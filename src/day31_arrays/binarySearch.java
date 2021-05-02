package day31_arrays;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int[] numbers = {33, 55, 123, 555};
        Arrays.binarySearch(numbers, 55);
        System.out.println(Arrays.binarySearch(numbers, 55));
        System.out.println(Arrays.binarySearch(numbers, 500));
        System.out.println(Arrays.binarySearch(numbers, 600));
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 20));
        System.out.println(Arrays.binarySearch(numbers, 40));
        System.out.println(Arrays.binarySearch(numbers, 123));

        if(Arrays.binarySearch(numbers, 123) >=0){
            System.out.println("123 is present in array");

        }else{
            System.out.println("123 is not present in arrays");
        }
    }
}
