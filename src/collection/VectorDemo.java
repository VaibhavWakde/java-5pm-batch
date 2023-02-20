package collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("C++");
        vector.add("Java");
        vector.add("Data Structure");
        vector.add("Python");
        vector.add(3,"VB");

        System.out.println(vector);

        System.out.println("vector.get(2) "+vector.get(2));

        System.out.println("vector.remove(1) "+vector.remove(1));

        System.out.println(vector.contains("Python")); // it search element is contains or not return bool

    }
}
