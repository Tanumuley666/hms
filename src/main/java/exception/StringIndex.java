package exception;

public class StringIndex {
    public static void main(String[] args) {
        try {
            String s = "Java";
            System.out.println(s.charAt(10));

        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds in string!");
        }
    }
}
