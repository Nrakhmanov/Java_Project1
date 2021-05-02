package day21_string_manipulations;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "Bamboo";
        System.out.println(word.toUpperCase());
        System.out.println(word.length());

        System.out.println(word.replace("boo", "baloo"));


        System.out.println(word.replace('B', 'v').replace('o','e'));


        String sentence = "Java is fun";
        String withNospace = sentence.replace(" ", "");
        System.out.println("withNospace = " + withNospace);
               
        
        //System.out.println(withNospace.replace(" ", ""));
        
        sentence = sentence.replace("Java", "Selenium").replace("fun", "a lot of. fun");
        System.out.println(sentence);

        String result = "1-48 of over 4,000 results for java book";
        
        //result = result.replace("1-48 of over 4,","4").replace(" results for java book","");

        result = result.replace("1-48 of over ","")
                .replace(",","")
                .replace(" results for java book","");
        System.out.println(result);

    }
}