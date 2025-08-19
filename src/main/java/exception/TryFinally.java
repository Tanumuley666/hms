package exception;

public class TryFinally {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");

        }finally {
            System.out.println("This is the finally block.");
        }
    }
}
