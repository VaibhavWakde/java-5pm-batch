package java8.biFunction;

import java.util.Scanner;
import java.util.function.BiFunction;

public class HWCalculator {
    public static void main(String[] args) {
        Boolean menu = true;
        Integer option;
        Integer num1;
        Integer num2;
        Scanner sc = new Scanner(System.in);

        BiFunction<Integer,Integer,Integer> addition = (x,y) -> x+y;
        BiFunction<Integer,Integer,Integer> substraction = (x,y) -> x-y;
        BiFunction<Integer,Integer,Integer> multiplication = (x,y) -> x*y;
        BiFunction<Integer,Integer,Integer> division = (x,y) -> x/y;
        BiFunction<Integer,Integer,Integer> modulo = (x,y) -> x%y;

        do{
            System.out.println("Select Option Below: ");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            option = sc.nextInt();

            System.out.println("Enter First Number");
            num1 = sc.nextInt();
            System.out.println("Enter Second Number");
            num2 = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Addition of "+num1+" & "+ num2+" : "+addition.apply(num1,num2));
//                    menu = false;
                    break;
                case 2:
                    System.out.println("Substraction of "+num1+" & "+ num2+" : "+substraction.apply(num1,num2));
//                    menu = false;
                    break;
                case 3:
                    System.out.println("Multiplication of "+num1+" & "+ num2+" : "+multiplication.apply(num1,num2));
//                    menu = false;
                    break;
                case 4:
                    System.out.println("Division of "+num1+" & "+ num2+" : "+division.apply(num1,num2));
//                    menu = false;
                    break;
                case 5:
                    System.out.println("Modulo of "+num1+" & "+ num2+" : "+modulo.apply(num1,num2));
//                    menu = false;
                    break;
            }

        }while(menu == true);
    }
}
