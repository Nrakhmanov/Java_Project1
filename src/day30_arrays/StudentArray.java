package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
       student1[0] = "SS6969";
        student1[1] = "Steppenwolf";
        student1[2] = "Monster";
        student1[3] = "B22";
        student1[4] = "111118888111";

        String[] student2 = {"SS6969", "Steppenwolf", "Monster", "Batch22", "999999999"};

        System.out.println("student1 ID = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 phone number = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("Pass: data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("Pass: data arrays length match");
        } else {
            System.out.println("Fail: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        int[] nums = {11, 22, 33, 44, 55};
        for (int i = 0; i <nums.length ; i++) {//if you put equal sign then you should add -1==> i<=nums.length-1
            System.out.println(nums[i]);
        }



    }
}
