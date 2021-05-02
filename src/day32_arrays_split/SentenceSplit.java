package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);

        for(String w : words){
            System.out.println(w);
        }

        String googleResult = "About 1,810,00 results (0.68 seconds)";

        String[] result = googleResult.split(" ");
        System.out.println(result[1]);
        System.out.println(result[3].replace("(","")+" " + result[4].replace(")",""));
        System.out.println(result[3].substring(1));


        String cats = "bengal cat tiger cat persian cat hungry cat";
        String[] numberOfCats = cats.split(" ");


    }
}
