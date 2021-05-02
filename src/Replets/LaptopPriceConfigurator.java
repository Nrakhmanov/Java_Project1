package Replets;
import java.util.Scanner;
public class LaptopPriceConfigurator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0.0;
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        System.out.println("Select CPU type");
        String cpuType = scan.next();
        System.out.println("Select RAM size");
        int ramSize = scan.nextInt();
        System.out.println("Select storage type:");
        String storageType = scan.next();
        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();
        System.out.println("Enter screen resolution:");
        String screenRes = scan.next();

        if(screenSize==13.3){
            price += 200;
        }else if(screenSize==15.0){
            price += 300;
        }else if(screenSize==17.3){
            price += 400;
        }

        if(cpuType.equals("i3")){
            price += 150;
        }else if(cpuType.equals("i5")){
            price += 250;
        }else if(cpuType.equals("i7")){
            price += 350;
        }

        price += (ramSize/4) * 50;

        if(storageType.equals("HDD")){
            price = (memorySize/500)*50;
        }else if(storageType.equals("SSD")){
            price += (memorySize/500)*100;
        }

        if(screenRes.equals("4K")){
            price +=200;
        }else if(screenRes.equals("FULLHD")){
            price += 100;
        }
        System.out.println("Laptop price is: " + price);










    }
}


