package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Bugaga] From Number < +1 (112) 233-4455> Message : {Hello, lets code some java}";

        int start = message.indexOf("[");
        int end = message.indexOf("]");

        String sender = message.substring(start +1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<") +1, message.indexOf('>'));
        System.out.println("mobile = " + mobile);
        
        String text = message.substring(message.indexOf("{") +1, message.indexOf("}"));
        System.out.println("text = " + text);


        String thing = " Bamba loo";
        System.out.println(thing.trim());





    }
}
