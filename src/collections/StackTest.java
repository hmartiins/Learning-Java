package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {

    public static void main(String[] args) {

        Deque<String> books = new ArrayDeque<>();

        books.add("Hobbit");
        books.push("Harry Potter");
        books.push("Ilíada");

        for(String book: books) {
            System.out.println(book);
        }

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.poll());
        System.out.println(books.pop());
        System.out.println(books.remove());

        // books.size();
        // books.clear();
        // books.isEmpty();

    }

}
