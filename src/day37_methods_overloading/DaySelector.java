package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayname(1));
        System.out.println(getDayname(5));

        for (int i = 1; i <=8 ; i++) {
            System.out.println(i + " = " + getDayname(i));

        }
        System.out.println(getDayNameV2(2));

    }

    public static String getDayname(int day) {


        switch (day) {
            case 1:
                return "Monday";
                //break; not gonna work here because return already exits the method. unreachable code
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null;

        }}

        public static String getDayNameV2(int day1) {
            String dayName;
            switch(day1) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName= "Sunday";
                    break;
                default:
                    System.out.println("Invalid day - " + day1);
                    dayName = null;
            }

            return dayName;
        }


    }

