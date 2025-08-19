package CollectionFramework;


import java.util.TreeMap;


public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        studentMap.put(103,"Alice");
        studentMap.put(101,"John");
        studentMap.put(102,"David");

        for (Integer key : studentMap.keySet()) {
            System.out.println("Roll No: " + key + ", name: " + studentMap.get(key));
        }

    }
}
