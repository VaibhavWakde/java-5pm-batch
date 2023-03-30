package java8.biFunction;

import java.util.function.BiFunction;

public class HWAdditionBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> addition = (x,y) -> x+y;

        System.out.println("addition of numbers : "+addition.apply(10,20));
    }
}
