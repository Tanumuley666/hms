package Java8Features;

interface  Greeting {
    void sayHello();
}
public class lambdaExample {
    public static void main(String[] args) {
        //Lambda expression for greeting hello

        Greeting greet = () -> System.out.println("hello, Java8");
        greet.sayHello();

    }
}
