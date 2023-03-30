package java8.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {

        //map
        List<Integer> list = Arrays.asList(3,5,6,9,11,18,25,36,43,52,63,71,88,95);
        Stream<Integer> stream = list.stream().map(n->n*5);
        stream.forEach(System.out::println);

        //filter
        list.stream().filter(n->n<50).forEach(System.out::println);

        //min
        Stream<Integer> numbers = list.stream();
        Integer min = numbers.min((n1,n2)->n1<n2?-1:1).get();
        System.out.println("Min Value : "+min);

        //max
        Integer max = list.stream().max((n1,n2)->n1>n2?1:-1).get();
        System.out.println("Max Value : "+max);

        //sum
//        list.stream().reduce()

        //count
        Long count = list.stream().count();
        System.out.println("Count : "+count);



        //convert list into set using stream
        List<Integer> integers = Arrays.asList(1,2,3,4,5,4);
        Set<Integer> set = integers.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println(set);

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        List<Integer> list1 = set1.stream().collect(Collectors.toList());
        list1.forEach(System.out::println);

        Integer newArray[] = list1.stream().toArray(Integer[]::new);

        System.out.println("after list convert to array ");
        for(int i=0;i<newArray.length;i++){
            System.out.println((i+1)+" element "+newArray[i]);
        }


    }
}
