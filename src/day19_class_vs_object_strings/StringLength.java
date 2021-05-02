package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "Bambaloo";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("word = " + word.length());


        String password = "abc123";

        if(password.length() >= 6){
        System.out.println("Password accepted");
        }else {
            System.out.println("Password too short");
        }


    }
}
