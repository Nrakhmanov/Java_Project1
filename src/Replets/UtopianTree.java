package Replets;

public class UtopianTree {
    public static void main(String[] args) {

        int year = 1;
        int growth = 1;
        int treeSize = 1;

        do{
            System.out.println("year " + year + "- growth " + growth + " cm");
            System.out.println("tree size: " + treeSize + " cm");
            if(year>2)
                growth = 2;
            year++;
            treeSize +=  growth;
             }while(year<=10);



}}
