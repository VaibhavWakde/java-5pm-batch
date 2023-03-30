package java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    Product(int id, String name, float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaComparatorDemo {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"HP laptop",20000));
        list.add(new Product(2,"keyboard",500));
        list.add(new Product(3,"Mouse",500));

        System.out.println("sorting on basis of name");

        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
