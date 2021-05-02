package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil",
                                     "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia",
                                     "Philippines", "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China",
                                     "United States", "Russia"};
        for( double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.print(eachPrice + " ");
            }
        }

            System.out.println("\n ------ prices between 10 and 70------");

            for(double price : prices){
               if(price>=10 && price<=70){
                System.out.print(price + " ");
            }
        }

        System.out.println("\n ------ count of the prices that more than 50----");

            int count = 0;
            for(double each : prices)
            if(each>50){
                count ++;
            }
        System.out.println("count = " + count);

        System.out.println("\n-------with name length more than 7------");

         int countryCount = 0;
        for(String countryNames : countries){
            if(countryNames.length()>=7){
                countryCount++;
                //System.out.print(countryNames+ " ");
                System.out.println(countryNames + "-" + countryNames.length());
            }
        }
        System.out.println();
        System.out.println("countryCount = " + countryCount);





    }
}
