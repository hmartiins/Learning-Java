package collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Henrique");
        users.put(20, "Henry");
        users.put(3, "Steve");
        users.put(4, "Carlos");


        System.out.println(users.size());
        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(20));
        System.out.println(users.containsValue("Carlos"));

        System.out.println(users.get(3));

        for(int key: users.keySet()) {
            System.out.println(key);
        }

        for(String value: users.values()) {
            System.out.println(value);
        }

        for(Map.Entry<Integer, String> register: users.entrySet()) {
            System.out.println(register);
        }
    }

}
