package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class  Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks= marks;
    }
    public String getName() {
        return name;
    }
}
public class MapToAnotherList {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Amit", 85),
                new Student("Neha",90),
                new Student("Ravi",78));

                List<String> names = list.stream()
                        .map(Student::getName)
                        .collect(Collectors.toList());

        System.out.println(names);


    }
}
