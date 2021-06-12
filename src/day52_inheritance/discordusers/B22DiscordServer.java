package day52_inheritance.discordusers;



public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Satoshi");
        user1.setRole("Architect");
        System.out.println(user1.toString());

        Admin admin1 = new Admin();
        admin1.setId(6969);
        admin1.setName("Lucy");
        admin1.setRole("Admin");
        System.out.println(admin1);
    }
}
