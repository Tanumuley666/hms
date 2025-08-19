package CollectionFramework;

import java.util.HashSet;

public class ArrayListDemo {
    public static void main(String[] args) {
        HashSet<Integer> ids = new HashSet<>();
        ids.add(101);
        ids.add(102);
        ids.add(101);

        for (Integer id : ids) {
            System.out.println(id);
        }
    }
    }
