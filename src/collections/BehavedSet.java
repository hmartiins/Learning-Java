package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BehavedSet {

    public static void main(String[] args) {

        //Set<String> list = new HashSet<>();
        SortedSet<String> list = new TreeSet<>();
        list.add("Henrique");
        list.add("Lucas");
        list.add("Tiago");
        list.add("Rafael");
        list.add("Clovis");

        for(String name: list) {
            System.out.println(name);
        }

    }

}
