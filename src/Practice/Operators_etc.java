package Practice;

public class Operators_etc {
    public static void main(String[] args) {
     /*   int a = 3, b = 2;
       // long c = (a-- + b) * 2 / 3 % 2;
       // System.out.println(c);

        //int c = a--;
        //int d = --a;


        //System.out.println(a);
        //System.out.println(c);
        //System.out.println(d);

        int e = --a + --b;

        System.out.println(e);
        System.out.println(a);
      System.out.println(b);
*/
       // int numOne = 10;
       // int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
       // int biggest = numOne > numTwo ? numOne : numTwo;

       // System.out.println(numOne);
        //System.out.println(numTwo);

        int a = 3, b = 2;
        //int c = a++ + ++a + a-- + --a;
        //      3+1   1+4   5-1   4-1
        //       4     5     4     3


        //int d = --a + b++ - ++b - a++ + ++b;
        //      3-1   2+1   3+1   2+1   4+1
        //       2   +  3  -   4  -   3  +   5


        int d = --a;
        d = a--;

        System.out.println(a); //3
        //System.out.println(b); //5
        System.out.println(d); //3

    }
}
