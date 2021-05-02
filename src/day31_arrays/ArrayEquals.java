package day31_arrays;
import java.util.*;
public class ArrayEquals {
    public static void main(String[] args) {
        //Arrays.equals(array1, array2) => gives boolean condition true or false. Size and data type should be the same to be true. otherwise its false
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3};

        Arrays.equals(nums1, nums2);
        System.out.println(Arrays.equals(nums1, nums2));

        int[] nums3 = {5, 10, 15, 20};
        int[] nums4 = {4, 8, 12, 16};

        System.out.println(Arrays.equals(nums3, nums4));
    }
}
