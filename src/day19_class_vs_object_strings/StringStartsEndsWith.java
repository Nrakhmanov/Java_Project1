package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        String word = "Bambaloo";
        System.out.println(word.startsWith("Bam")); //true
        System.out.println(word.startsWith("Bambaloo")); //true

        System.out.println(word.startsWith("bam"));// false

        System.out.println(word.endsWith("baloo")); //true


        String firstName = "Dr. Who";

        if(firstName.startsWith("Mr.")){
            System.out.println("Man");
        }else if(firstName.startsWith("Dr.")){
            System.out.println("Doctor Degree");
        }else if(firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        }else{
            System.out.println("SDET");
        }

    }
}
