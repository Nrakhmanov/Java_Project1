package day47_constructors;

public class AddressList {
    public static void main(String[] args) {

        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipcode("22182");

        System.out.println("Cybertek School address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("Address after update = " + cybertekAddress);
        System.out.println("Street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipcode("22181");
        System.out.println(newAddress.toString());

        Address papJohn = new Address("1234 Mama John street", "Yorkshire", "Alaska", "123456");
        System.out.println(papJohn);




    }
}
