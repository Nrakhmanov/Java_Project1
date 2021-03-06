package day52_inheritance.discordusers;

public class Admin extends User {

    public Admin() {
        super(); // calls super class no-args constructor
        System.out.println("Admin class constructor");

    }

    public Admin(String name, int id) {
        super("Admin", name, id );
        System.out.println("Admin 2 args constructor");
    }

    @Override
    public String toString() {
        return "User{" +
                "role=" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", userID=" + getId() +
                '}';

    }


}
