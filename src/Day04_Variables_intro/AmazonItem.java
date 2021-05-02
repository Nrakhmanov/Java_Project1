package Day04_Variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        String description = "HIC wooden spoon";
        int ratingsCount = 181;
        double price = 5.99;
        String seller = "Amazon.com";
        Boolean prime = true;

        System.out.println("---Product Infromation---");
         System.out.println(description);
        System.out.println("rating-" + ratingsCount);
        System.out.println("price-" + price);
        System.out.println("seller-" + seller);
        System.out.println("prime-" + prime);

    }
}
