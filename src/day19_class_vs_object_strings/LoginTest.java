package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassWord = "abc123";
        String userName = "cybertek123";
        String passWord = "Abc123";

        if(expUserName.equalsIgnoreCase(userName) && expPassWord.equals(passWord)){
            System.out.println("Pass - user successfully logged in");
        }else {
            System.out.println("Login failed");


           // if (!expUserName.equals(userName)){
          //  System.out.println("User name is incorrect");
        //}else {
           // System.out.println("Password is incorrect");
        }
        }
    }

