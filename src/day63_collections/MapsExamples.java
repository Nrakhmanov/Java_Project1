package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Chloe");
        map.put(69, "Safiya");
        map.put(99, "Safiya");

        System.out.println(map);
        System.out.println(map.get(99));

        System.out.println(map.containsKey(69));
        System.out.println(map.containsValue("Kukaracha"));

        for (Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));

            if(map.get(key).equals("Chloe")) {
                System.out.println("this is our key" + key);
            }
        }

    }

}
