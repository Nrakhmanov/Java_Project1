package day14_multibranch_if_statements;
import java.util.Scanner;
public class YesOrNO {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        Scanner scan = new Scanner(System.in);
        String selection = "Y";
        boolean answer;
        String result;

        if(selection == "Y"){
            System.out.println("Your file will be deleted");
            answer = true;
            result = "deleted";
        }else{
            System.out.println("File deletion cancelled");
            answer = false;
            result = "not deleted";
        }
        System.out.println("Did file get deleted - " + answer);
        System.out.println(result);



    }
}
