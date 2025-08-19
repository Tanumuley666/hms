package Arrays;

public class CharCount {
    public static void main(String[] args) {
        String s = "banana";
        char target = 'a';
        long count = s.chars().filter(c -> c == target).count();
        System.out.println(count);
    }
}
