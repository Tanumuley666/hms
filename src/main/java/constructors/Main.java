package constructors;

class Student {
    String name;
    int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public  void showDetails() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Tanu",24);
        s1.showDetails();
    }
}
