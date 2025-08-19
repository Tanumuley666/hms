package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> animals = new LinkedHashSet<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Cat");

        System.out.println("Animals: " + animals);
    }
}
