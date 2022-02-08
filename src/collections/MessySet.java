package collections;

import java.util.HashSet;
import java.util.Set;

public class MessySet {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(1.2);    // double -> Double
        set.add(true);
        set.add("test");
        set.add(3);

        System.out.println(set.size());

        set.add(3);
        System.out.println(set.size());

        System.out.println(set.remove("test"));
        System.out.println(set.contains(3));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        set.addAll(nums);
        System.out.println(set);
        set.retainAll(nums);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }

}
