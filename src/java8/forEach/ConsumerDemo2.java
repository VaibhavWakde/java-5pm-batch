package java8.forEach;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo2 {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        List<String> list = Arrays.asList("Vaibhav","Kavita","Pooja","Jayashri");

        list.forEach(consumer);

    }
}
