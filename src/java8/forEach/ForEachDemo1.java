package java8.forEach;

import java.util.*;

public class ForEachDemo1 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Pune","Mumbai","Goa","Delhi","surat");

//        Iterator iterator = cities.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        cities.forEach(city ->{
//            System.out.println(city);
//        });

        cities.forEach(System.out::println);
    }
}
