package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {

        int num = 18;

        if(num%3 == 0 && num%5== 0){
            System.out.println("FizzBuzz");
        }else if(num%3==0){
            System.out.println("Fizz");
        }else if(num%5==0){
            System.out.println("Buzz");
        }
        //order of IF conditions is important, because in multi branch IF condition statements only first true condition will be checked.

    }
}
