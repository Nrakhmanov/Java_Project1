package day15_logicalOps_switch_ternery;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Nuclear weapon";
        if(onSale && freeShipping){
            System.out.println("Add " + itemName + " to cart");

        }

        if(onSale && freeShipping && itemName.equals("Nuclear weapon")){
            System.out.println("Add " + itemName + " to cart");
        }
    }

}
