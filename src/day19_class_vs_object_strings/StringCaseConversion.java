package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTek";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        
        
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);


        word = word.toLowerCase(); //re-assigning word with new string variable all lower case letter


        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);



    }
}
