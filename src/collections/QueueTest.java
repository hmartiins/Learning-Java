package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Ana");      // Exception
        queue.offer("Bia"); // return false
        queue.add("Henrique");
        queue.offer("Carlos");
        queue.add("Lucas");

        // returns the first element in the queue without removing
        System.out.println(queue.peek());    // null
        System.out.println(queue.element()); // exception

        // returns the first element in the queue by removing it from the queue
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());   // null
        System.out.println(queue.remove()); // exception

    }

}
