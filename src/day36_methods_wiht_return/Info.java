package day36_methods_wiht_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {


        if (isMarried()) {
            System.out.println("married");
        }else{
            System.out.println("free man");
        }

        System.out.println(getRandomYear());
        
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);




    }

    public static String fullName(){
        return "Ken Adams";
    }
    public static Boolean isMarried(){
        return false;
    }
    public static int getAge(){
      //  int age =35; you can also declare variable inside method
      //  return age;
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
