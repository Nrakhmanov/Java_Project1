package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(100, 34));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);
        System.out.println(Double.max(234.43, 23.54));
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);

        System.out.println(Double.compare(5, 1)); // if first number is larger output will be 1
        System.out.println(Double.compare(5,5)); // if both numbers are equal output will be 0
        System.out.println(Double.compare(1,2)); // if second number is larger output will be -1

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('V'));
        System.out.println(Character.isAlphabetic(100));
        System.out.println(Character.isLetter('R'));
        System.out.println(Character.isLetter('9'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS FuN";
        for (int i = 0; i <word.length() ; i++) {
            if(Character.isUpperCase(word.charAt(i))){ //whenever there is character involved usually use .charAt()
                System.out.print(word.charAt(i));
            }
        }

        System.out.println();
        System.out.println(Boolean.TRUE);

        String total = "345";
        int count = Integer.parseInt(total);
        int num = Integer.parseInt("55");

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);


        }
    }

