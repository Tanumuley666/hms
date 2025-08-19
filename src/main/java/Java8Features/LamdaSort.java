package Java8Features;

import java.util.Arrays;
import java.util.List;

public class LamdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj","Rani","Raja");

        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Ascending: " + names);

        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Descending:" +names);
    }
}
