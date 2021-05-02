package day18_conditions_practice_strings_intro;

public class CarLeaseingTest {
    public static void main(String[] args) {

       String make = "Mercedes";
       String model = "E";
       double leasePrice = 0;

       if(make.equals("Mercedes") && model.equals("E")){
           leasePrice = 500;
       }else if( model.equals("Mercedes") && make.equals("A")){
           leasePrice = 400;
      }

     //   if(make.equals("Mercedes")){
      //      if(model.equals("E"))
     //           leasePrice = 500.0;
     //       if(make.equals("A"))

        System.out.println("model = " + model);
        System.out.println("make = " + make);
        System.out.println("leasePrice = " + leasePrice);
    }
}
