package day31_arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for(char each : letters){
        System.out.print(each+" ");
        }
        String sentence = new String(letters); //convert CHAR ARRAY into STRINGS.
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray(); //converts String into CHAR ARRAY
        System.out.println(itemArray);
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length = " + item.length());

        for(char each : itemArray){
            System.out.print(each+" ");
        }
        System.out.println();
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
       // System.out.println(fruits[0] + "-" + fruits[1] + "-" + fruits[2] + "-" + fruits[3] + "-"+ fruits[4] + "-" + fruits[5]);
        String fruitStr = "";
        for(String each:fruits){
            System.out.print(each+"-");

          fruitStr += each + "-";

        }
        System.out.println("\nfruitStr = " + fruitStr);
        //System.out.print("\nfruit str = " + fruitStr.substring(0, fruitStr.lastIndexOf("-")));
        System.out.println(fruitStr.substring(0,fruitStr.length()-1));

        System.out.println();

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", languages));

        System.out.println(String.join("=", languages));

        String str1 = "git";
        char [] words = str1.toCharArray();

    }
}
