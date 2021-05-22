package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {


        long start = System.nanoTime();

        List<Integer> mlnNums = getIntegerList();
        //System.out.println(mlnNums);
        long end = System.nanoTime();
        double secondsList = (end-start)/1000000000.0;
        System.out.println("ArrayList time = " + (end - start));
        System.out.println("ArrayList time seconds = " + secondsList);

        long start1 = System.nanoTime();
        int[] numbers = getIntegerArray();
        long end1 = System.nanoTime();
        double seconds = (end1-start1)/1000000000.0;
        System.out.println("Array time = " + (end1 - start1));
        System.out.println("Array time seconds = " + seconds);

    }

    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <=1000000 ; i++) {
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray(){
        int[] nums = new int[1000001];
        for (int i = 0; i <=1000000 ; i++) {
            nums[i] = i;
        }
         return nums;
    }


}
