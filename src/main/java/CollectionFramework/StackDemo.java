package CollectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("Python");

        System.out.println("Top book: " + books.peek());
        System.out.println("Removed: " + books.pop());
        System.out.println("Now top book: " + books.peek());
    }
}
