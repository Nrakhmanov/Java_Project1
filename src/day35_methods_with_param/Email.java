package day35_methods_with_param;


public class Email {
    public static void main(String[] args) {

        buildEmail("bluebambaloo", "gmail");
        buildEmail("BLUE BAMBALOO", "GMAIL");

    }

    public static void buildEmail(String name, String domain){
        System.out.println(name.replace(" ", "_").toLowerCase() + "@" + domain.toLowerCase() + ".com");
    }
}
