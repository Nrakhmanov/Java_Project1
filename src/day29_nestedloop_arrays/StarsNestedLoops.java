package day29_nestedloop_arrays;

public class StarsNestedLoops {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.println();


        for (int outer = 1; outer <= 20; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        for (int outer = 1; outer <= 20; outer++) {
            for (int inner = 20; inner >= outer; inner--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
