package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public String toString() {
        return id + " - " + name + " - " + salary;


    }
}
public class FilterEmployees {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "Tanu", 95000),
                new Employee(2, "Tabu", 75000),
                new Employee(3, "Tashu", 85000));
        List<Employee> filtered = list.stream()
                .filter(emp -> emp.salary > 90000)
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);


    }

    }





