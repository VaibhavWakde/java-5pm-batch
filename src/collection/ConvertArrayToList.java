package collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"Apple", "Banana", "kiwi"};
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        System.out.println(list);

        String fruitsArray[] = (String[]) list.toArray();
    }
}
