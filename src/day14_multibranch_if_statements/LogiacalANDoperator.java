package day14_multibranch_if_statements;

public class LogiacalANDoperator {
    public static void main(String[] args) {
        int apples = 10, oranges = 5;
        
        boolean check = apples >5 && oranges > 3;
        System.out.println("check = " + check);

        if(apples>6 && oranges >2){
            System.out.println("I have enough apples and oranges");
        }else{
            System.out.println("I need to go to King Soopers to buy some more");
        }
    }
}
