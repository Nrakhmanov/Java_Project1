package day10_shorthand_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 10;
        a+=23;
        System.out.println("a = " + a);
        
        a-=31;
        System.out.println("a = " + a);
        
        a*=64;
        System.out.println("a = " + a);
        
        a/=23;
        System.out.println("a = " + a);
        
        String word = "Java";
        System.out.println("word = " + word);
        word = word + "programming";
        System.out.println("word = " + word);
        word+=" is fun ";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word+=selenium;
        System.out.println(" word " + word);

        word+= 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        word+=letter;
        System.out.println("word = " + word);
        
        char letter1 = 'A';
        System.out.println("letter1 = " + letter1);
        
        letter1+= 3;
        System.out.println("letter1 = " + letter1);
        
        letter1+= 'J';
        System.out.println("letter1 = " + letter1);
        
        letter+='U';
        System.out.println("letter = " + letter);
        
        double parkingFee = 7.50;
        System.out.println("normal parking Fee = " + parkingFee);
        
        parkingFee/=2;
        System.out.println("early bird parking Fee = " + parkingFee);

        parkingFee*=0;
        System.out.println("weekend parking Fee = " + parkingFee);






    }
}
