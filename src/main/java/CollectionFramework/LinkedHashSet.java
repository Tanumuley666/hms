package CollectionFramework;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<String> cities = new java.util.LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Banglore");
        cities.add("Delhi");

        System.out.println("Cities (Insertion Order); " + cities);

    }
}
