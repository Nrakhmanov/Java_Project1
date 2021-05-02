package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        int num = Integer.parseInt("55");
        System.out.println("count = " + count);

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);
        if(price>100){
            System.out.println("You can buy");
        }

        String sentence = "I wrote 1000 lines of code";
        String[] strArr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(strArr[2]);
        System.out.println(linesOfCode);
    }
}
