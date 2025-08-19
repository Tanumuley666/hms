package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Rahul");
        employeeMap.put(2,"Sneha");

        for (Integer key : employeeMap.keySet()) {
            System.out.println("ID:" + key + ",Name: " + employeeMap.get(key));
            
        }
    }
}
