package Day11_Comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {

       //PRE-INCREMENT

        int num1 = 10;
        int num2 = ++num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT

        int num3 = 8;
        int num4 = num3++;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);

        int myNumber = 20;
        System.out.println(++myNumber);
        System.out.println(myNumber);
        System.out.println(myNumber++);
        System.out.println(myNumber);

        int yourNumber = 15;
        int herNumber = ++yourNumber;
        System.out.println(herNumber);
        System.out.println(yourNumber);

        int numberX = 99;
        int numberY = numberX++;

        System.out.println(numberX);
        System.out.println(numberY);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a - " + a);
        System.out.println("b - " + b);
        System.out.println("c - " + c);








    }

}
