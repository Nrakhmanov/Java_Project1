package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");words.add("a"); words.add("input");
        words.add("title");
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(24, 45, 65, 78, 23, 10);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

   }
   public static void printStrList (List<String> stringList){
        for( String each : stringList){
            System.out.print(each + " ");
        }
       System.out.println();
   }

   List<Integer> nums = Arrays.asList(24, 45, 65, 78, 23, 10);

   public static int sumIntegerList(List<Integer> integerList) {
        int sum = 0;

           for (int i : integerList ) {
               sum += i;

           }
       return sum;
       }

}

