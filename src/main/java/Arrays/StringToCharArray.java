package Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "hello";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
}
