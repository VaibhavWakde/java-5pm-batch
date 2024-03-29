package java8.streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana","Grapes","Mango");
        Stream<String> stream = fruits.stream();

       Stream<String> upperCaseList = stream.map(fruit->{
            return fruit.toUpperCase();
        });

       upperCaseList.forEach(System.out::println);
    }
}
