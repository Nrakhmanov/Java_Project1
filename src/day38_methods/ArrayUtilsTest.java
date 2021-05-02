package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {

        int [] nums = {5,3,6,8,34,65,12,378,987};
        ArrayUtils.printArray(nums);

        System.out.println("sum is = " + ArrayUtils.sum(nums));
        System.out.println("sum is = " + ArrayUtils.sum(new int []{5,6,8,65,12,378}));


        ArrayUtils.isContain(new int[]{3,4,5,7,9}, 7);


    }
}
