package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> fruits = new ArrayDeque<>();
        fruits.addFirst("Apple"); // Inserts the specified element at the end of this deque
        fruits.addLast("JackFruit"); // Inserts the specified element at the front of this deque
        fruits.offerFirst("Mango"); //Inserts the specified element at the end of this deque
        fruits.offerLast("Pomegranate"); // Retrieves and removes the first element of this deque
        fruits.addFirst("Banana");

        fruits.removeFirst(); //Retrieves and removes the last element of this deque.
        fruits.removeLast(); // Retrieves and removes the first element of this deque

        fruits.pollFirst(); //Retrieves and removes the last element of this deque
        fruits.pollLast(); //Retrieves, but does not remove, the first element of this deque

        fruits.getFirst(); //Retrieves, but does not remove, the last element of this deque.
        fruits.getLast(); //Retrieves, but does not remove, the first element of this deque

        fruits.peekFirst(); //Retrieves, but does not remove, the last element of this deque
        fruits.peekLast(); //Removes the first occurrence of the specified element from this deque

        System.out.println("fruits peek last "+fruits.peekLast());

        for (String s: fruits){
            System.out.println(s);
        }
    }
}
