package day21_string_manipulations;

public class FirstandLastTest {
    public static void main(String[] args) {

        String word = "MOM";

        char first = word.charAt(0);
        char last = word.charAt(2);

        if(first == last){
            System.out.println("first and last letter match");
        }else{
            System.out.println("first and last letter mismatch");
        }

        String car = "civic";
        char firstLetter = car.charAt(0);
        int count = car.length();
        char lastLetter = car.charAt(count -1);

        //char lastLetter = car.charAt( car.length() -1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);



        String index = "java";
        System.out.println(index.indexOf("j"));


    }
}
