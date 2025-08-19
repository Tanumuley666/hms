package CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Ravi");
        names.add("Amit");
        names.add("Ravi");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
