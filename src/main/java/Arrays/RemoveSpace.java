package Arrays;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.trim());
        System.out.println(s.replaceAll("\\s", ""));
    }
}
