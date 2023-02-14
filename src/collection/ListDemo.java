package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Pune");
        list.add("Mumbai");
        list.add("Nagpur");
        list.add("Bangalore");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        System.out.println(list);
    }
}
