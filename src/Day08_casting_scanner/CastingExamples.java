package Day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {

        // *****IMPLICIT CASTING******
        double x = 0.9;
        int z = (int)x;

        System.out.println(z);

        int a = 125;
        byte b = (byte)a;

        System.out.println(b);

        byte num1 = 100;
        short num2 = num1;
        System.out.println(num2);

        short num3 = 200;
        int num4 = num3;

        System.out.println(num4);

        int num5 = 464654;
        long num6 = num5;

        System.out.println(num6);

        long num7 = 5498754;
        double num8 = num7;

        System.out.println(num8);

        float num9 = 456.5f;
        double num10 = num9;

        System.out.println(num10);
        System.out.println("num10 = " + num10);

    //******* EXPLICIT CASTING**********
        int a1 = 55;
        byte a2 = (byte)a1;
        System.out.println(a2);

        long a3 = 444444L;
        int a4 = (int)a3;
        System.out.println(a4);

        double a5 = 5555.23;
        long a6 = (int)a5;
        System.out.println(a6);




        //CASTING CHAR TO INT

        char letter = 'N';
        int numLetter = letter;
        System.out.println(numLetter);



    }
}
