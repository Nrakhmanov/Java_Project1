package day38_methods;

import java.util.Arrays;

public class ArrayUtils {

    public static void printArray(int[] nums){
        for( int num : nums ){
            System.out.print(num + " ");
        }
        System.out.println();

    }
    public static int sum(int[] nums){
        int total = 0;
        for(int sum : nums){
          total += sum;
        }
        return total;
    }

    public static boolean isContain (int[] nums, int num){
        boolean found = false;
        for(int each : nums){
            if(each == num){
                found = true;
                break;
            }
        }
       return found;
    }

  public static boolean equals(int[] a, int[] b){
       boolean contain = Arrays.equals( a,b);
      return contain;

        }


}
