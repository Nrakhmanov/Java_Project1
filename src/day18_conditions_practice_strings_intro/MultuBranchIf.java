package day18_conditions_practice_strings_intro;

public class MultuBranchIf {
    public static void main(String[] args) {

        int number = 5;

        if(number>0){
            System.out.println("number is positive");
        }else  if(number<0){
            System.out.println("Number is negative");
        }else if(number==0){
            System.out.println("number is equal to 0");
        }
    }
}
