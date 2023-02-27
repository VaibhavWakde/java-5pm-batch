package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.remove("D");

        System.out.println(set);
        for(String s:set){
            System.out.println(s);
        }
    }
}
