package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 10;
        //nums[3] = 100; //ArrayIndexIsOutOfBoundsException - we declared only 3 variables in the Array. We can not change size or length of Array.
                               // You need to create new Array or use ArrayList

        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        //we can use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]);//7

        //how to find array size

        System.out.println(nums.length); //length in here is only value. in word.length() it is a method.

        int len = nums.length;
        System.out.println(len);

        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;
        nums[2] = nums[1];

        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        //different ways of declaring and assigning valuse to Array
        //          index    0       1      2     3     4   5   6
        int[] nums2 = {123, 234, 345, 657, 43, 3, 1};
        System.out.println(nums2.length);
        System.out.println(nums2[0]);

        double[] prices = new double[] {5.5, 6.8, 41.2, 11.8};
        int[] newNums = new int[]{1, 2, 3, 4, 5};

    }
}
