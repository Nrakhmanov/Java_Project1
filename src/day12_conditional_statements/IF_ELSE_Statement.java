package day12_conditional_statements;

import java.sql.SQLOutput;

public class IF_ELSE_Statement {
    public static void main(String[] args) {

        if(100>99){
            System.out.println("Condition is true");}
        else {
            System.out.println("Condition is false");}


        int count = 25;
        if(count>30){
            System.out.println("Count is more than 30");
        }else {
            System.out.println("Count is less than 30");
        }

        byte age = 42;
        if(age>=18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Go home");
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }

        byte age1 = 12;
        if(age1>=18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Go home");
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }



    }
}
