package java8.optional;


import java.util.Optional;

/**
 * It is a public final class and used to deal with NullPointerException in Java application.
 * You must import java.util package to use this class.
 * It provides methods which are used to check the presence of value for particular variable.
 */
public class OptionalDemo {
    public static void main(String[] args) {

        // without optional class
        String[] str = new String[10];
        String lowercaseString = str[5].toLowerCase();
        System.out.print(lowercaseString); // shows Null pointer exception

        // with optional class
        String[] fruits = new String[10];
        Optional<String> checkNull = Optional.ofNullable(fruits[5]);
        if (checkNull.isPresent()){
            String lowercaseFruits = fruits[5].toLowerCase();
            System.out.println(lowercaseFruits);
        }else {
            System.out.println("Value is not present");
        }


    }
}
