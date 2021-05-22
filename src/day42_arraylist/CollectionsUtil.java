package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        Collections.reverse(letters);

        System.out.println( Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters,'i', 'j');
        System.out.println("after replace all = " + letters);

        Collections.sort(letters);
        System.out.println(letters);

        List<Integer> nums = Arrays.asList(8, 5, 9, 10, 0, -34, 999, 4, 1, 5, 5, 1, 5);
        System.out.println("nums = " + nums);
        Collections.sort(nums);
        System.out.println("nums = " + nums);
        
        int max = Collections.max(nums);
        System.out.println("max num = " + max);
        int min = Collections.min(nums);
        System.out.println("min num = " + min);
        
        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);
        
        int countOfOnes = Collections.frequency(nums, 1);
        System.out.println("countOfOnes = " + countOfOnes);

        Collections.replaceAll(nums, 5, 50);
        System.out.println(nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(" reversed sorting = " + nums);

        Collections.shuffle(nums);
        System.out.println(" after shuffle = " + nums);



        




    }
}
