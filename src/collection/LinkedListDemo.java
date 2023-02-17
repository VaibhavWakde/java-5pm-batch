package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ramesh");
        list.add("Vinay");
        list.add("Suresh");

        list.forEach(s -> {
            System.out.println(s);
        });

        System.out.println();

        list.add(2,"Minal");

        list.forEach(s -> {
            System.out.println(s);
        });


        System.out.println();


        list.addFirst("Chikoo");
        list.addLast("Soni");
        list.removeFirst();
        System.out.println("list.get(0) "+list.get(0));
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
