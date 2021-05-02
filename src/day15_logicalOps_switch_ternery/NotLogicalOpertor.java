package day15_logicalOps_switch_ternery;

public class NotLogicalOpertor {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));


        int age = 2;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat");
        }


        boolean isSmokingAllowed = false;

        if(!isSmokingAllowed){
            System.out.println("Smoking is not allowed");
        }

    }




    }