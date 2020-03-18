package lv.javaguru.classwork.lesson9;

import java.util.HashMap;
import java.util.Map;

public class PlayWithHashMap {

    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("Bob", "555-1234-321");
        contacts.put("Susie", "555-4321-111");

        System.out.println(contacts);
        System.out.println(contacts.entrySet());
        System.out.println(contacts.keySet());

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Key: " + entry.getKey()
                    + ", Value: " + entry.getValue());
        }

        System.out.println("Bob's number is: " + contacts.get("Bob"));

    }

}
