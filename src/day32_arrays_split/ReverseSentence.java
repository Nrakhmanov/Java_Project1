package day32_arrays_split;
import java.util.*;
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length-1; i >=0; i--) {
          reversed += words[i]+" ";
        }
        System.out.println("sentence = "+ sentence);
        System.out.println("reversed = " + reversed.trim());

    }
}
