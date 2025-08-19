package exception;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int x = 10/2;
            System.out.println("Result: " + x);

        }finally {
            System.out.println("This is always runs.");
        }
    }
}
