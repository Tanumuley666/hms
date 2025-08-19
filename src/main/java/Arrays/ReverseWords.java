package Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Java is fun";
        String [] words = s.split("");
        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse().toString()+" ");
        }
    }
}
