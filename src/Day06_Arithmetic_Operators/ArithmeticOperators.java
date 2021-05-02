package Day06_Arithmetic_Operators;

public class ArithmeticOperators {
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a+b+a-b-b);
        System.out.println(a+b-a/b*b-a/b-b*a);
        System.out.println(a+b-(a*b) +b);

        double x = 3.45;
        double y = 5.19;

        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(12%5);

        byte c = -12;
        byte d = -5;

        System.out.println(c+d);
        System.out.println(-2-5);
    }
}
