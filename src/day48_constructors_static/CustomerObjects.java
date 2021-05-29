package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1.toString());

        Customer cs2 = new Customer("Mike", 2);
        System.out.println(cs2);

        Customer cs3 = new Customer("Satoshi Nakamoto", 6969);
        System.out.println(cs3);

        //array of customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Batman", 7777)};

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Superman", 9999));
        customerList.add(new Customer("Aquaman", 5555));

        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0));

        System.out.println(customerList);

        for (int i = 0; i < customerList.size() ; i++) {
            System.out.println(customerList.get(i));

        }

        for(Customer each : customerList) {
            System.out.println(each);

        }

        for(Customer each : customerList) {
            System.out.println(each.getName());

        }

        for(Customer each : customerList) {
            System.out.println(each.getId());

        }

       customerList.forEach(each -> System.out.println(each.getName() + " - " + each.getId()));//Lambda method


    }
}
