package day22_string_manipulation;

import java.util.Arrays;

public class indexOfExample {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        // first comma
        System.out.println(technologies.indexOf(",")); //4
        // last comma
        System.out.println(technologies.lastIndexOf(",")); //40

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index = " + indexOfJava);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index = " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index of = " + indexOfSql);

        // technologies contains maven

        if(technologies.contains("maven")) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }

        //`String technologies = "java, html, css, selenium, testng, maven, cucumber";


        if(technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }






    }
}
