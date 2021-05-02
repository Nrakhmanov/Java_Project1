package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 45;
        String reply = (hourlyRate>=50) ? "accept" : "decline";
        System.out.println(reply);

        String todaysClass = "Java";
        String  teacher = todaysClass.equals("Java") ? "Saim|Murodil" : "Nadir";
        System.out.println("teache = " + teacher);
        
        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "yes, have DL. Can drive" : "No DL. Cannot Drive";
        System.out.println("driving = " + driving);


    }
}
