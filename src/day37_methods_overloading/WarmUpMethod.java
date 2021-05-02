package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {

        loginVoid("cybertekStudent", "abc123");

        System.out.println(login("cybertekStudent","abc123"));

        if(login("cybertekStudent","abc123")){
            System.out.println("Login successful, welcome to Canvas");
        }else{
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("shmuck", "quack");
        System.out.println("isLoginsuccess = " + isLoginSuccess);

        if(login("shmuck", "quack")){
            System.out.println("Welcome to Canvas, select course or calendar");
        }else{
            System.out.println("Something wrong with your credentials");
        }

    }

    public static void loginVoid(String userName, String password){
        String secretUserName= "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            System.out.println("login successful, welcome CybertekStudent!");
        }else{
            System.out.println("incorrect username or password");
        }

    }


    public static boolean login(String userName, String password){
        String secretUserName= "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            return true; // return true, and exit method here. return false will not run
        }
            return false;
        }

    }


