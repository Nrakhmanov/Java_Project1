package day15_logicalOps_switch_ternery;

public class UsedCarSelector {
    public static void main(String[] args) {

        double budget = 5000.0;
        String model = "Honda";
        double carPrice = 8999.0;

        if(carPrice<=budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("BMW"))){
            System.out.println("Ready to purchase model =" + model + ", price = " + carPrice);
        }else {
            System.out.println("not interested in model =  " + model + ", price = " + carPrice);
        }
    }
}
