package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while(count>=0){
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("finished the count");

        int unreadSMS = 10;
        System.out.println("You have" + unreadSMS + " unread messages");
        while(unreadSMS>=1){
            System.out.println("Read message :" + unreadSMS);
            unreadSMS--;
        }
        System.out.println("No more unread SMS");


    }
        }
