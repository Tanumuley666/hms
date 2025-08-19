package CollectionFramework;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println("List: " + fruits);

        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Apple");
        System.out.println("Set: " + fruitSet);

        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(1, "Mango");
        System.out.println("Map: " + fruitMap);

    }

}
