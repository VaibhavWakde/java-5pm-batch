package java8.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Hi");
        list.add("Hello");
        list.add("How are you");

        list.forEach((e)->{
            System.out.println(e);
        });
    }
}
