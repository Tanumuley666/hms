package CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A","B","A","C","B");
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
    }
}
