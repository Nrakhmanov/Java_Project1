package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeeding = 45;
        int speedLimit = 35;
        boolean isSpeeding = currentSpeeding > speedLimit;
        System.out.println("Are you speeding? = " + isSpeeding);


        double accountBalance = 250.69;
        double itemPrice = 150;
        System.out.println(accountBalance>=itemPrice);

        accountBalance -= itemPrice;
        System.out.println(accountBalance);


        boolean isBroke = accountBalance <= 0;
        System.out.println("Are you broke? = " + isBroke);





    }
    
}

