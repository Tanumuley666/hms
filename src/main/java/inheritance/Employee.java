package inheritance;

public class Employee {
    double salary;

}

class Programmer extends Employee {
    String name;

    public Programmer(String name, double salary) {
        this.name = name;
        this.salary= salary;

    }
    public void printInfo() {
        System.out.println("name " +name+ "salary " + salary);
    }
}
