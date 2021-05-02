package day35_methods_with_param;

public class MethodsWithinputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        displayValue(3333);
        int count = 55;
        displayValue(count);
        greetByName("Bugaga");
        String name = "Bambaloo";
        greetByName(name);

    }

    public static void displayValue(int num){
        System.out.println("the value is " + num);
    }

    public static void greetByName(String name){
        System.out.println("Hello " + name + ", How Are you today?");
    }
}
