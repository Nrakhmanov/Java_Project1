package day29_nestedloop_arrays;

public class CountCharNestedLoop {
    public static void main(String[] args) {

        String word = "java";

        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer " + outer);
            int count = 0; //reset count to 0 every time for outer loop
            for (int inner = 0; inner < word.length(); inner++){  //inner loop will check first index of outer loop with whole word in inner loop and find matching characters.
                if (word.charAt(outer) == word.charAt(inner)) { //after that will exit inner loop and goes back to outer loop for second character and match it again in inner loop
                    count++;  //if it finds matching characters count  +1
                }

            }
            System.out.println(word.charAt(outer) + "=" + count);
        }
    }
}
