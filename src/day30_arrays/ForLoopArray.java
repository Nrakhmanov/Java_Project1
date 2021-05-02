package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {


        int[] nums = {7, 69, 33, 77, 10, 345, 999, 111, 1, 9999};
        for (int eachNum : nums) {
            System.out.print(eachNum + " ");


            }
        System.out.println();

            for(int i =0; i< nums.length; i+=2){
                System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.print(nums[nums.length-1]); //to print last value in array

        System.out.println();

        for (int idx =  nums.length-1; idx >= 0 ; idx--) {
            System.out.print(nums[idx] + " ");
        }




}
}