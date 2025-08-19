package Strings;

public class LoopCon {
    public static void main(String[] args) {
        String result = " ";
        for (int i = 1; i <= 3; i++) {
            result += "Part" + i + " ";
        }
        System.out.println(result.trim());
    }
}
