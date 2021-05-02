package day29_nestedloop_arrays;

public class StringLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int i = 0; i<word.length(); i++){
            for(int j = 0; j<=i; j++){
                System.out.println(word.charAt(j));
            }
            System.out.println();
        }
    }
}
