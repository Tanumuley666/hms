package Java8Features;

public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Task is running");
        new Thread(task).start();
    }
}
