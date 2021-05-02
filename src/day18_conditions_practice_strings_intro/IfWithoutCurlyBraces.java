package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";
        // if you have only one statement you don't need to put curly braces but always use them anyway.

        if(todaysClass.equals("Java"))
            System.out.println("Java is fun");
        else
            System.out.println("it is not Java. It is " + todaysClass);

    }
}
