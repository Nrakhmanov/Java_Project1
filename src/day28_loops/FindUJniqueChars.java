package day28_loops;

public class FindUJniqueChars {
    public static void main(String[] args) {
        String word = "javva";
        String unique = "";

        for(int i = 0; i<word.length(); i++) {

            if (!unique.contains(word.charAt(i)+"")) { //converting to String by adding ""
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
/*how to check if char is in String. we can usew CONTAINS method. CONTAINS method accepts STRING as input.
String word = "hello";
word.contains('h')  ==> error
char letter = 'e':
word.contains(letter) ==> Error. Because CONTAINS accepts only STRING
word.contains(word.charAt(0) ==> Error. not STRING

to make work you need to add ""
char letter = 'e';
word.contains(letter + "");
word.contains(charAt(0) + "")) == word.charAt(1) + "" - will make STRING as a whole
+"" can be used to convert a char into STRING
100 - int
100+"" - String
123.5 - double
123.5+"" - String
char ch = 'Q';
ch + "" - String



 */