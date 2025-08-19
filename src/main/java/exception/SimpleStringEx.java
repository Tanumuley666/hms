package exception;

public class SimpleStringEx {
    public static void main(String[] args) {
        try{
            String text = null;
            System.out.println(text.length());

        }catch (NullPointerException e) {
            System.out.println("Error: Null string.");
        }
    }
}
