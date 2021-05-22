package day43_list_custom_classes;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println(getDays());
        System.out.println(getDays().get(0));
        System.out.println(getDays().size());
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        System.out.println(dayNames.get(4));
        dayNames.add("Java Day");

        //dayNames.removeIf(day -> day.length() == 6 ); //like foreach loop
        //System.out.println("dayNames after removeIf = " + dayNames);
        dayNames.removeIf(day -> day.startsWith("S"));
        System.out.println("dayNames = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        
        nums.removeIf(n -> n < 90);
        System.out.println("nums = " + nums);

    }


    public static List<String> getDays(){
        //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        return days;
    }

    public static List<Integer> getRandomList(int size){
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            //int n = random.nextInt(101);
            //if(!randomNumbers.contains(n)){
            //randomNumbers.add(n);
        //}
        randomNumbers.add(random.nextInt(101));


        }
        return randomNumbers;
    }




}
