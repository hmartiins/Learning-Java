package collections;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("Henrique");
        list.add(u1);
        list.add(new User("Carlos"));
        list.add(new User("Lucas"));
        list.add(new User("Edson"));

        System.out.println(list.get(3)); // access by index
        list.remove(3);
        list.remove(new User("Lucas"));

        System.out.println("Tem?" + list.contains(new User("Henrique")));

        for(User user: list) {
            System.out.println(user.name);
        }

    }

}
