package day31_arrays;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {4, 6, 89,32, 123, 4567, 0};
        System.out.println(Arrays.toString(nums)); //print all nums in one line

        Arrays.sort(nums); //to sort numbers from small to large and change the value inside variable
        System.out.println(Arrays.toString(nums)); //to print sorted numbers

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums, Collections.reverseOrder());

        String[] words = {"once", "upon", "a", "time"};
        System.out.println(Arrays.toString(nums));
        System.out.println("[" + String.join(", ", words) +"]" );

        Arrays.sort(words); //sort words in alphabetic order
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words)); //to print always use Arrays.toString()

        int[] numbers = {33, 55, 123, 555};
        Arrays.binarySearch(numbers, 55);
        System.out.println(Arrays.binarySearch(numbers, 55));
        System.out.println(Arrays.binarySearch(numbers, 500));
        System.out.println(Arrays.binarySearch(numbers, 600));
        System.out.println(Arrays.binarySearch(numbers, 10));

      
    }}
