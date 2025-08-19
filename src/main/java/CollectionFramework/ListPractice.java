package CollectionFramework;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Alice","Bob", "Alice","John");

        Set<String> uniqueNames = new HashSet<>(names);

        List<String> sortedNames = new ArrayList<>(uniqueNames);
        Collections.sort(sortedNames);

        System.out.println("Sorted Unique Names: " + sortedNames);
    }
}
