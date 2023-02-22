package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("India");
        queue.offer("NY"); // it's like add method

        System.out.println(queue);
        System.out.println(queue.peek()); //retrive first element
        System.out.println(queue);
        System.out.println(queue.poll()); // retrive first element and remove it
        System.out.println(queue);
    }
}
