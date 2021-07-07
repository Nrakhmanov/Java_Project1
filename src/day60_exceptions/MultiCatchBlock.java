package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
        //String word = null;

        try {
            System.out.println("word = " + word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));
            //System.out.println(10/0);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled. Please check if String has valid value");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is wrong. Please check if you entered valid index");
        } catch (Throwable t) {
            System.out.println("Exception got caught");
            System.out.println("Reason = " + t.getMessage());
        }


    }
}
