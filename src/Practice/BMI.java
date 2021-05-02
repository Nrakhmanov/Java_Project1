package Practice;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms: ");
        double mass = scan.nextDouble();
        System.out.println("Plese enter your height in meters");
        double height = scan.nextDouble();

        double BMI = mass/height*2;

        if(BMI<18.5){
            System.out.println("Underweight");
        }else if(BMI>=18.5 && BMI<=25){
            System.out.println("Normal weight");
        }else if(BMI>25 && BMI<30){
            System.out.println("Overweight");
        }else if(BMI>=30){
            System.out.println("Obese");
        }

    }
}
